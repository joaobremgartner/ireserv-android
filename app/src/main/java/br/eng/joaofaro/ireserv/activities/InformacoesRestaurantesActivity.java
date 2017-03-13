package br.eng.joaofaro.ireserv.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.oguzdev.circularfloatingactionmenu.library.FloatingActionMenu;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

import java.util.Map;

import br.eng.joaofaro.ireserv.R;
import br.eng.joaofaro.ireserv.adapters.ViewPagerAdapter;
import br.eng.joaofaro.ireserv.fragments.TabComentariosFragment;
import br.eng.joaofaro.ireserv.fragments.TabDescricaoFragment;
import br.eng.joaofaro.ireserv.fragments.TabMapaFragment;
import br.eng.joaofaro.ireserv.helpers.DetalhesRestauranteHelper;
import br.eng.joaofaro.ireserv.tutoriais.DetalhesRestauranteShowCase;

public class InformacoesRestaurantesActivity extends AppCompatActivity {

    private DetalhesRestauranteHelper helper;
    private DetalhesRestauranteShowCase tutorial;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacoes_ireserv);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


        helper = new DetalhesRestauranteHelper(this);
        tutorial = new DetalhesRestauranteShowCase(this);

        //Teste
        ImageView imagemToolbar = (ImageView) findViewById(R.id.imagem_toolbar);
        imagemToolbar.setImageResource(R.drawable.mustang);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        final FloatingActionButton fabAction = (FloatingActionButton) findViewById(R.id.fab2);

        montaActionMenuFB(fabAction, helper.getIconesFabMenu());

        tutorial.mostraTutorial(fab, R.string.titulo_compartilhamento,
                R.string.conteudo_compartilhamento);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, R.string.emailireserv, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new TabMapaFragment(), "Mapa");
        adapter.addFragment(new TabDescricaoFragment(), "Descrição");
        adapter.addFragment(new TabComentariosFragment(), "Comentários");
        viewPager.setAdapter(adapter);
    }

    private void montaActionMenuFB(FloatingActionButton fabAction, Map<String, View> iconesMenuFab) {
        SubActionButton.Builder subMenuTeste = new SubActionButton.Builder(this);
        SubActionButton.Builder subMenuTeste2 = new SubActionButton.Builder(this);
        SubActionButton.Builder subMenuTeste3 = new SubActionButton.Builder(this);

        if (!iconesMenuFab.isEmpty()) {

            SubActionButton botao1 = subMenuTeste.setContentView(iconesMenuFab.get("transporte"))
                    .build();
            SubActionButton botao2 = subMenuTeste2.setContentView(iconesMenuFab.get("cardapio"))
                    .build();
            SubActionButton botao3 = subMenuTeste3.setContentView(iconesMenuFab.get("ofertas"))
                    .build();
            new FloatingActionMenu.Builder(this)
                    .addSubActionView(botao1)
                    .addSubActionView(botao2)
                    .addSubActionView(botao3)
                    .attachTo(fabAction)
                    .build();
        }
    }
}
