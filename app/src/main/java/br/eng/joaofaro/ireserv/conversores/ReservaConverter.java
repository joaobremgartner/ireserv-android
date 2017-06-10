package br.eng.joaofaro.ireserv.conversores;

import org.json.JSONException;
import org.json.JSONStringer;

import br.eng.joaofaro.ireserv.models.Reservas;

/**
 * @author Created by joaofaro on 09/06/17.
 */

public class ReservaConverter {

    public String converteParaJson(Reservas reserva) {
        JSONStringer json = new JSONStringer();

        try {
            json.object();
            json.key("id").value(reserva.getId());
            json.key("codReserva").value(reserva.getCodReserva());
            json.key("dtReserva").value(reserva.getDtReserva());
            json.key("estabelecimento").value(reserva.getEstabelecimento());
            json.key("confirmado").value(reserva.isConfirmado());
            json.key("status").value(reserva.getStatus());
            json.endObject();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return json.toString();
    }
}
