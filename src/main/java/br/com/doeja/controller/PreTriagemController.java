package br.com.doeja.controller;

import br.com.doeja.controller.dto.BancoSangueDto;
import br.com.doeja.controller.dto.PreTriagemDto;
import br.com.doeja.controller.dto.UsuarioDto;
import br.com.doeja.controller.form.AtualizacaoBancoSangue;
import br.com.doeja.controller.form.AtualizacaoPreTriagem;
import br.com.doeja.controller.form.PreTriagemForm;
import br.com.doeja.controller.form.UsuarioForm;
import br.com.doeja.modelo.BancoSangue;
import br.com.doeja.modelo.PreTriagem;
import br.com.doeja.modelo.Usuario;
import br.com.doeja.repository.PreTriagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pretriagem")
@CrossOrigin(origins =  "*")
public class PreTriagemController {

    @Autowired
    private PreTriagemRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<PreTriagemDto> cadastrar(@RequestBody final PreTriagemForm form, UriComponentsBuilder uriBuilder) {
        PreTriagem preTriagem = form.converter(repository);
        repository.save(preTriagem);

        URI uri = uriBuilder.path("/cadastro/{id}").buildAndExpand(preTriagem.getId()).toUri();
        return ResponseEntity.created(uri).body(new PreTriagemDto(preTriagem));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PreTriagemDto> atualiza(@PathVariable Long id, @RequestBody @Valid AtualizacaoPreTriagem form){
        Optional<PreTriagem> optional = repository.findById(id);
        if (optional.isPresent()){
            PreTriagem preTriagem = form.atualizar(id, repository);
            return ResponseEntity.ok(new PreTriagemDto(preTriagem));
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public List<PreTriagemDto> listaPeloUsuarioId(@PathVariable Long id){
        List<PreTriagem> preTriagem = repository.findByUsuarioId(id);
        return PreTriagemDto.converter(preTriagem);
    }
}
