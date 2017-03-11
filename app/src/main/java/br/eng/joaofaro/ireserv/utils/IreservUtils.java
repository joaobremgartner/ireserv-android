package br.eng.joaofaro.ireserv.utils;

import org.apache.commons.lang3.StringUtils;

import br.eng.joaofaro.ireserv.models.Estabelecimento;

/**
 * Created by joaofaro on 11/03/17.
 */

public class IreservUtils {

    public static String formataAvaliacaoRestaurante(Estabelecimento estabelecimento) {
        String nota = Double.valueOf(estabelecimento.getNotaAvaliacao()).toString();
        String notaFormatada = StringUtils.replace(nota, ".", ",");

        return notaFormatada;
    }
}
