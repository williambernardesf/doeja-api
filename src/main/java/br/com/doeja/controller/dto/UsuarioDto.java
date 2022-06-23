package br.com.doeja.controller.dto;

import br.com.doeja.modelo.Usuario;
import lombok.Data;

@Data
public class UsuarioDto {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String tipoSanguineo;
    private String linkImagem;

    public UsuarioDto(Usuario usuario){
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.cpf = usuario.getCpf();
        this.email = usuario.getEmail();
        this.tipoSanguineo = usuario.getTipoSanguineo();
        this.linkImagem = usuario.getLinkImagem();
    }

    public Long getId() {return id;}
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
    public String getTipoSanguineo() {return tipoSanguineo;}
    public void setTipoSanguineo(String tipoSanguineo) {this.tipoSanguineo = tipoSanguineo;}
    public String getLinkImagem() {return linkImagem;}
    public void setLinkImagem(String linkImagem) {this.linkImagem = linkImagem;}
}
