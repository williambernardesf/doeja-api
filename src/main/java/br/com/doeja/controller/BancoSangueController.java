package br.com.doeja.controller;

import br.com.doeja.controller.dto.BancoSangueDto;
import br.com.doeja.controller.form.AtualizacaoBancoSangue;
import br.com.doeja.controller.form.BancoSangueForm;
import br.com.doeja.modelo.BancoSangue;
import br.com.doeja.repository.BancoSangueRepository;
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
@RequestMapping("/hemobanco")
public class BancoSangueController {

    @Autowired
    private BancoSangueRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<BancoSangueDto> cadastrar(@RequestBody final BancoSangueForm form, UriComponentsBuilder uriBuilder){
        BancoSangue bancoSangue = form.converter(repository);
        repository.save(bancoSangue);

        URI uri = uriBuilder.path("/hemobanco/{id}").buildAndExpand(bancoSangue.getId()).toUri();
        return ResponseEntity.created(uri).body(new BancoSangueDto(bancoSangue));
    }

    @GetMapping
    public List<BancoSangueDto> listaTudo(){
        List<BancoSangue> hemobancos = repository.findAll();
        return BancoSangueDto.converter(hemobancos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BancoSangueDto> atualiza(@PathVariable Long id, @RequestBody @Valid AtualizacaoBancoSangue form){
        Optional<BancoSangue> optional = repository.findById(id);
        if (optional.isPresent()){
            BancoSangue bancoSangue = form.atualizar(id, repository);
            return ResponseEntity.ok(new BancoSangueDto(bancoSangue));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<?> remover(@PathVariable Long id){
        Optional<BancoSangue> optional = repository.findById(id);
        if (optional.isPresent()){
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}