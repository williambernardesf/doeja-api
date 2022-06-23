package br.com.doeja.controller;

import br.com.doeja.controller.dto.BancoSangueDto;
import br.com.doeja.controller.dto.UsuarioDto;
import br.com.doeja.controller.form.AtualizacaoBancoSangue;
import br.com.doeja.controller.form.AtualizacaoUsuario;
import br.com.doeja.controller.form.UsuarioForm;
import br.com.doeja.modelo.BancoSangue;
import br.com.doeja.modelo.Usuario;
import br.com.doeja.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.Optional;

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

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDto> atualiza(@PathVariable Long id, @RequestBody @Valid AtualizacaoUsuario form){
        Optional<Usuario> optional = repository.findById(id);
        if (optional.isPresent()){
            Usuario usuario = form.atualizar(id, repository);
            return ResponseEntity.ok(new UsuarioDto(usuario));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> remover(@PathVariable Long id){
        Optional<Usuario> optional = repository.findById(id);
        if (optional.isPresent()){
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}