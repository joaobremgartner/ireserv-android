package br.eng.joaofaro.ireserv.models;

import java.io.Serializable;
import java.util.List;

/**
 * @author Created by joaofaro on 08/03/17.
 */
//TODO
public class Estabelecimento implements Serializable {

    private Long id;
    private String nome;
    private String nuTelefone;
    private String email;
    private String informativo;
    private String endereco;
    private double notaAvaliacao;
    private String site;
    private List<Comentario> comentarios;

    //TODO - implementar a imagem como um path String
    private int imagemLogo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public int getImagemLogo() {
        return imagemLogo;
    }

    public void setImagemLogo(int imagemLogo) {
        this.imagemLogo = imagemLogo;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getNuTelefone() {
        return nuTelefone;
    }

    public void setNuTelefone(String nuTelefone) {
        this.nuTelefone = nuTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInformativo() {
        return informativo;
    }

    public void setInformativo(String informativo) {
        this.informativo = informativo;
    }
}

