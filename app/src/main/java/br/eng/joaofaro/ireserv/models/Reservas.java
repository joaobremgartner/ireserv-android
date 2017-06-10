package br.eng.joaofaro.ireserv.models;

import java.util.Date;

import br.eng.joaofaro.ireserv.enums.StatusDaReserva;

/**
 * @author Created by joaofaro on 09/06/17.
 */

public class Reservas {

    private Long id;

    private String codReserva;
    private Date dtReserva;
    private Estabelecimento estabelecimento;
    private boolean confirmado;
    private StatusDaReserva status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodReserva() {
        return codReserva;
    }

    public void setCodReserva(String codReserva) {
        this.codReserva = codReserva;
    }

    public Date getDtReserva() {
        return dtReserva;
    }

    public void setDtReserva(Date dtReserva) {
        this.dtReserva = dtReserva;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }

    public StatusDaReserva getStatus() {
        return status;
    }

    public void setStatus(StatusDaReserva status) {
        this.status = status;
    }
}
