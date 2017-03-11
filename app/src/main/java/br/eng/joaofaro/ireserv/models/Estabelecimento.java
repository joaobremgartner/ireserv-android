package br.eng.joaofaro.ireserv.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by joaofaro on 08/03/17.
 */
//TODO
public class Estabelecimento implements Serializable {

    private Long id;
    private String nome;
    private String endereco;
    private double notaAvaliacao;
    private List<String> comentarios;
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

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }

    public int getImagemLogo() {
        return imagemLogo;
    }

    public void setImagemLogo(int imagemLogo) {
        this.imagemLogo = imagemLogo;
    }
}

