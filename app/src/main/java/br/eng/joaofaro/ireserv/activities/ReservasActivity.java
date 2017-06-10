package br.eng.joaofaro.ireserv.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.eng.joaofaro.ireserv.R;
import br.eng.joaofaro.ireserv.adapters.RestaurantesAdapter;
import br.eng.joaofaro.ireserv.conversores.ReservaConverter;
import br.eng.joaofaro.ireserv.enums.StatusDaReserva;
import br.eng.joaofaro.ireserv.listeners.ToolbarBottomListener;
import br.eng.joaofaro.ireserv.models.Estabelecimento;
import br.eng.joaofaro.ireserv.models.Reservas;
import br.eng.joaofaro.ireserv.tasks.RecebeListaDeRestaurantes;

public class ReservasActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private List<Estabelecimento> estabelecimentos;
    private Estabelecimento estabelecimento;

    private ListView listaEstabelecimentos;
    private Toolbar toolbarBottom;
    private List<View> listaAcoesToolbarBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservas);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.listaAcoesToolbarBottom = new ArrayList<>();

        //TODO
        toolbarBottom = (Toolbar) findViewById(R.id.inc_tb_bottom);
        ImageView login = (ImageView) findViewById(R.id.menu_bottom_profile);
        ImageView favoritos = (ImageView) findViewById(R.id.menu_bottom_favoritos);
        ImageView info = (ImageView) findViewById(R.id.menu_bottom_info);
        ImageView configuracoes = (ImageView) findViewById(R.id.iv_settings);
        this.listaAcoesToolbarBottom.add(login);
        this.listaAcoesToolbarBottom.add(favoritos);
        this.listaAcoesToolbarBottom.add(info);
        this.listaAcoesToolbarBottom.add(configuracoes);
        setListener(listaAcoesToolbarBottom);

        //TESTE
        this.listaEstabelecimentos = (ListView) findViewById(R.id.lista_cards);

        this.estabelecimentos = new ArrayList<Estabelecimento>();

        for (int i = 1; i < 10; i++) {
            this.estabelecimento = new Estabelecimento();
            estabelecimento.setId(new Long(i));
            estabelecimento.setNome("Restaurante do João "+ i);
            estabelecimento.setEndereco("Endereço "+ i);
            estabelecimento.setNotaAvaliacao(4.3);
            estabelecimento.setImagemLogo(R.drawable.mustang);
            this.estabelecimentos.add(this.estabelecimento);

        }

        RestaurantesAdapter adapter = new RestaurantesAdapter(this, estabelecimentos);
        this.listaEstabelecimentos.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReservaConverter converter = new ReservaConverter();
                //Teste envio object json
                Reservas reservas = new Reservas();
                reservas.setId(1L);
                reservas.setCodReserva("COD123");
                reservas.setDtReserva(new Date());
                reservas.setConfirmado(true);
                reservas.setStatus(StatusDaReserva.R);
                reservas.setEstabelecimento(null);
                String json = converter.converteParaJson(reservas);

                Snackbar.make(view, json, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.reservas, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.atualizar:
                new RecebeListaDeRestaurantes(this).execute();
                break;
            case R.id.buscar:
                Toast.makeText(this, "TODO - implementar a busca de restaurantes",
                        Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.reservas) {

        } else if (id == R.id.avaliacao) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setListener(List<View> lista) {
        for (View view:lista) {
            view.setOnClickListener(new ToolbarBottomListener());
        }
    }
}
