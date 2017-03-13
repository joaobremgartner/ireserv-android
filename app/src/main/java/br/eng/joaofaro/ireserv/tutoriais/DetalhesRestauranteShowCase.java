package br.eng.joaofaro.ireserv.tutoriais;

import android.graphics.Point;
import android.text.Layout;
import android.view.View;

import com.github.amlcurran.showcaseview.ShowcaseView;
import com.github.amlcurran.showcaseview.targets.Target;
import com.github.amlcurran.showcaseview.targets.ViewTarget;

import br.eng.joaofaro.ireserv.R;
import br.eng.joaofaro.ireserv.activities.InformacoesRestaurantesActivity;

/**
 * Created by joaofaro on 12/03/17.
 */

public class DetalhesRestauranteShowCase {

    private final InformacoesRestaurantesActivity activity;

    public DetalhesRestauranteShowCase(InformacoesRestaurantesActivity activity) {
        this.activity = activity;
    }

    public void mostraTutorial(final View componente, int titulo, int conteudo) {
        ShowcaseView compartilhamento = new ShowcaseView.Builder(activity)
                .setTarget(new Target() {
                    @Override
                    public Point getPoint() {
                        return new ViewTarget(componente).getPoint();
                    }
                })
                .setContentTitle(titulo)
                .setContentText(conteudo)
                .hideOnTouchOutside()
                .withNewStyleShowcase()
                .setStyle(R.style.AppTheme)
                .build();
        compartilhamento.setDetailTextAlignment(Layout.Alignment.ALIGN_CENTER);
        compartilhamento.hideButton();
        compartilhamento.setTitleTextAlignment(Layout.Alignment.ALIGN_CENTER);
        compartilhamento.forceTextPosition(ShowcaseView.BELOW_SHOWCASE);
    }
}
