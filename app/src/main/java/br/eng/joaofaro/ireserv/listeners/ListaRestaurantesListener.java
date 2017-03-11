package br.eng.joaofaro.ireserv.listeners;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import br.eng.joaofaro.ireserv.R;
import br.eng.joaofaro.ireserv.activities.InformacoesRestaurantesActivity;

/**
 * Created by joaofaro on 11/03/17.
 */
public class ListaRestaurantesListener implements OnClickListener {

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.imagem_card:
                Toast.makeText(view.getContext(), "Teste", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), InformacoesRestaurantesActivity.class);
                view.getContext().startActivity(intent);
                break;
        }
    }
}
