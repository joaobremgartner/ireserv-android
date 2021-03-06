package br.eng.joaofaro.ireserv.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import br.eng.joaofaro.ireserv.R;
import br.eng.joaofaro.ireserv.helpers.CardRestauranteHelper;
import br.eng.joaofaro.ireserv.models.Estabelecimento;

/**
 * Created by joaofaro on 08/03/17.
 */
//TODO
public class RestaurantesAdapter extends BaseAdapter {

    private final List<Estabelecimento> estabelecimentos;
    private final Context contexto;

    public RestaurantesAdapter(Context contexto, List<Estabelecimento> estabelecimentos) {
        this.estabelecimentos = estabelecimentos;
        this.contexto = contexto;
    }

    @Override
    public int getCount() {
        return this.estabelecimentos.size();
    }

    @Override
    public Object getItem(int i) {
        return this.estabelecimentos.get(i);
    }

    @Override
    public long getItemId(int posicao) {
        return this.estabelecimentos.get(posicao).getId();
    }

    @Override
    public View getView(int posicao, View convertView, ViewGroup parent) {
        Estabelecimento estabelecimento = this.estabelecimentos.get(posicao);
        View listaCards = convertView;

        LayoutInflater inflater = LayoutInflater.from(this.contexto);
        if (listaCards == null) {
            listaCards = inflater.inflate(R.layout.content_reservas, parent, false);
        }

        setListeners(listaCards, estabelecimento);

        return listaCards;
    }

    private void setListeners(View view, Estabelecimento estabelecimento) {
        List<View> listaDeViews = new ArrayList<>();
        CardRestauranteHelper restauranteHelper = new CardRestauranteHelper(view,
                estabelecimento);
        restauranteHelper.populaCardEstabelecimento();
        listaDeViews.add(restauranteHelper.getImagemCard());
        restauranteHelper.trataEventoDeClique(listaDeViews, estabelecimento);
    }
}
