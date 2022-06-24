package br.com.doeja.controller;

import br.com.doeja.controller.dto.DoacaoDto;
import br.com.doeja.controller.dto.PreTriagemDto;
import br.com.doeja.controller.form.DoacaoForm;
import br.com.doeja.controller.form.PreTriagemForm;
import br.com.doeja.modelo.Doacao;
import br.com.doeja.modelo.PreTriagem;
import br.com.doeja.repository.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/doacao")
@CrossOrigin(origins =  "*")
public class DoacaoController {

    @Autowired
    private DoacaoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<DoacaoDto> cadastrar(@RequestBody final DoacaoForm form, UriComponentsBuilder uriBuilder) {
        Doacao doacao = form.converter(repository);
        repository.save(doacao);

        URI uri = uriBuilder.path("/cadastro/{id}").buildAndExpand(doacao.getId()).toUri();
        return ResponseEntity.created(uri).body(new DoacaoDto(doacao));
    }

    @GetMapping("/{id}")
    public List<DoacaoDto> listaPeloUsuarioId(@PathVariable Long id){
        List<Doacao> doacao = repository.findByUsuarioId(id);
        return DoacaoDto.converter(doacao);
    }
}
