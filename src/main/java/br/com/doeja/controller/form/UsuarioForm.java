package br.com.doeja.controller.form;

import br.com.doeja.modelo.Usuario;
import br.com.doeja.repository.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioForm {

    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private String tipoSanguineo;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setTipoSanguineo(String tipoSanguineo) {this.tipoSanguineo = tipoSanguineo;}

    public Usuario converter(UsuarioRepository repository){
        return new Usuario(nome, cpf, email, new BCryptPasswordEncoder().encode(senha), tipoSanguineo);
    }
}