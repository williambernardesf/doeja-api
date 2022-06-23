package br.com.doeja.controller;

import javax.validation.Valid;

import br.com.doeja.controller.dto.ErrorDto;
import br.com.doeja.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import br.com.doeja.config.security.TokenService;
import br.com.doeja.controller.dto.TokenDto;
import br.com.doeja.controller.form.LoginForm;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins =  "*")
public class AutenticacaoController {
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private TokenService tokenService;

	@PostMapping
	public ResponseEntity<?> autenticar(@RequestBody @Valid LoginForm form) {
		UsernamePasswordAuthenticationToken dadosLogin = form.converter();

		Authentication authentication = null;
		try {
			authentication = authManager.authenticate(dadosLogin);
			Usuario usuario = (Usuario) authentication.getPrincipal();
			String token = tokenService.gerarToken(authentication);
			return ResponseEntity.ok(new TokenDto(token, "Bearer", usuario));
		} catch (AuthenticationException e) {
			return ResponseEntity.badRequest().body(new ErrorDto("Email e/ou senha inválidos"));
		}
	}
	
}
