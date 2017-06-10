package br.eng.joaofaro.ireserv.models;

import java.io.Serializable;

/**
 * @author Created by joaofaro on 09/06/17.
 */

public class Comentario implements Serializable{

    private String comentario;
    private String nmCliente;
    private double avaliacao;

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}
