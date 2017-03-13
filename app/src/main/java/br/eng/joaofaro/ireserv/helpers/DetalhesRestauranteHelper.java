package br.eng.joaofaro.ireserv.helpers;

import android.view.View;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

import br.eng.joaofaro.ireserv.R;
import br.eng.joaofaro.ireserv.activities.InformacoesRestaurantesActivity;

/**
 * Created by joaofaro on 12/03/17.
 */

public class DetalhesRestauranteHelper {

    private final InformacoesRestaurantesActivity activity;
    private Map<String, View> iconesMenuFab;

    public DetalhesRestauranteHelper(InformacoesRestaurantesActivity activity) {
        this.activity = activity;
        iconesMenuFab = new HashMap<>();
    }

    public Map<String, View> getIconesFabMenu() {

        ImageView iconeTransporte = new ImageView(activity);
        iconeTransporte.setImageResource(R.drawable.ic_local_taxi);
        ImageView iconeCardapio = new ImageView(activity);
        iconeCardapio.setImageResource(R.drawable.ic_restaurant_menu);
        ImageView iconeOfertas = new ImageView(activity);
        iconeOfertas.setImageResource(R.drawable.ic_local_offer);

        iconesMenuFab.put("transporte", iconeTransporte);
        iconesMenuFab.put("cardapio", iconeCardapio);
        iconesMenuFab.put("ofertas", iconeOfertas);

        return iconesMenuFab;
    }
}
