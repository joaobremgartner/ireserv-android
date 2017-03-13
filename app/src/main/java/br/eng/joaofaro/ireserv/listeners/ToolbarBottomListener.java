package br.eng.joaofaro.ireserv.listeners;

import android.view.View;
import android.widget.Toast;

import br.eng.joaofaro.ireserv.R;

/**
 * Created by joaofaro on 11/03/17.
 */

public class ToolbarBottomListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.menu_bottom_profile:
                Toast.makeText(view.getContext(), "TODO - Implementar tela de login",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_bottom_favoritos:
                Toast.makeText(view.getContext(), "TODO - Implementar tela de favoritos",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_bottom_info:
                Toast.makeText(view.getContext(), "TODO - Implementar tela de informações",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.iv_settings:
                Toast.makeText(view.getContext(), "TODO - Implementar tela de configurações",
                        Toast.LENGTH_LONG).show();
                break;

        }
    }
}
