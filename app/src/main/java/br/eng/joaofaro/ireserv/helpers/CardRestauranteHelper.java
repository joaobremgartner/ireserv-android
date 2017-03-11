package br.eng.joaofaro.ireserv.helpers;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import br.eng.joaofaro.ireserv.R;
import br.eng.joaofaro.ireserv.models.Estabelecimento;
import br.eng.joaofaro.ireserv.utils.IreservUtils;

/**
 * Created by joaofaro on 11/03/17.
 */

public class CardRestauranteHelper {

    private final TextView nomeRestaurante;
    private final TextView endRestaurante;
    private final RatingBar rating;
    private final TextView nota;
    private final Estabelecimento estabelecimento;
    private final ImageView imagemCard;

    public CardRestauranteHelper(View view, Estabelecimento estabelecimento) {
        nomeRestaurante = (TextView) view.findViewById(R.id.texto_card);
        endRestaurante = (TextView) view.findViewById(R.id.texto_card_endereco);
        rating = (RatingBar) view.findViewById(R.id.rating_bar_card);
        nota = (TextView) view.findViewById(R.id.texto_nota);
        imagemCard = (ImageView) view.findViewById(R.id.imagem_card);

        this.estabelecimento = estabelecimento;
    }

    public void populaCardEstabelecimento() {
        nomeRestaurante.setText(estabelecimento.getNome());
        endRestaurante.setText(estabelecimento.getEndereco());
        rating.setRating((float) estabelecimento.getNotaAvaliacao());

        String notaFormatada = IreservUtils.formataAvaliacaoRestaurante(estabelecimento);

        nota.setText(notaFormatada);
    }

    public ImageView getImagemCard() {
        return imagemCard;
    }
}
