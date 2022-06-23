package br.com.doeja.controller.dto;

import br.com.doeja.modelo.Usuario;

public class TokenDto {

	private String token;
	private String tipo;

	private UsuarioDto usuario;

	public TokenDto(String token, String tipo, Usuario usuario) {
		this.token = token;
		this.tipo = tipo;
		this.usuario = new UsuarioDto(usuario);
	}

	public String getToken() {
		return token;
	}

	public String getTipo() {
		return tipo;
	}

	public UsuarioDto getUsuario() {
		return usuario;
	}
}
