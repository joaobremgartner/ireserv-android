package br.eng.joaofaro.ireserv.enums;

/**
 * @author Created by joaofaro on 09/06/17.
 */

public enum StatusDaReserva {
    P("Pendente"),
    C("Cancelada"),
    R("Reservado");

    private String descricao;

    private StatusDaReserva(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return getDescricao();
    }
}
