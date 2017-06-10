package br.eng.joaofaro.ireserv.models;

import java.io.Serializable;

/**
 * Created by joaofaro on 08/03/17.
 */
//TODO
public class Cliente implements Serializable {

    private Long id;

    private int ind_cancelamento;
    private String path_foto;
    private String cpf;
    private String email;
    private String nome;
    private Endereco endereco;
    private Usuarios usuario;

    public int getInd_cancelamento() {
        return ind_cancelamento;
    }

    public void setInd_cancelamento(int ind_cancelamento) {
        this.ind_cancelamento = ind_cancelamento;
    }

    public String getPath_foto() {
        return path_foto;
    }

    public void setPath_foto(String path_foto) {
        this.path_foto = path_foto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }
}
