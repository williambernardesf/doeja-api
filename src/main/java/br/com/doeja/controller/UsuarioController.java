package br.com.doeja.controller;

import br.com.doeja.controller.dto.UsuarioDto;
import br.com.doeja.controller.form.UsuarioForm;
import br.com.doeja.modelo.Usuario;
import br.com.doeja.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin(origins =  "*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<UsuarioDto> cadastrar(@RequestBody final UsuarioForm form, UriComponentsBuilder uriBuilder) {
        Usuario usuario = form.converter(repository);
        repository.save(usuario);

        URI uri = uriBuilder.path("/cadastro/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(new UsuarioDto(usuario));
    }
}