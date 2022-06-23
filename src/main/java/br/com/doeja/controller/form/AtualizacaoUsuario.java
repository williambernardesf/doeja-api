package br.com.doeja.controller.form;

import br.com.doeja.modelo.Usuario;
import br.com.doeja.repository.UsuarioRepository;

public class AtualizacaoUsuario {

    private String nome;
    private String tipoSanguineo;
    private String linkImagem;

    public void setNome(String nome) {this.nome = nome;}
    public void setTipoSanguineo(String tipoSanguineo) {this.tipoSanguineo = tipoSanguineo;}
    public void setLinkImagem(String linkImagem) {this.linkImagem = linkImagem;}

    public Usuario atualizar(Long id, UsuarioRepository repository){

        Usuario usuario = repository.getOne(id);

        usuario.setNome(this.nome);
        usuario.setTipoSanguineo(this.tipoSanguineo);
        usuario.setLinkImagem(this.linkImagem);
        repository.save(usuario);

        return usuario;
    }
}
