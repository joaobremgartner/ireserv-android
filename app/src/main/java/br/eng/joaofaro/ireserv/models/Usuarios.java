package br.eng.joaofaro.ireserv.models;

/**
 * @author Created by joaofaro on 01/05/17.
 */

class Usuarios {

    private Long id;

    private boolean ativo;
    private String nm_usuario;
    private String senha;
    private String grupo;

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getNm_usuario() {
        return nm_usuario;
    }

    public void setNm_usuario(String nm_usuario) {
        this.nm_usuario = nm_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Long getId() {
        return id;
    }
}
