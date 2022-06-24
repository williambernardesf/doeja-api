package br.com.doeja.controller.dto;

import br.com.doeja.modelo.BancoSangue;
import br.com.doeja.modelo.Doacao;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class DoacaoDto {

    private Long id;
    private Long usuarioId;
    private BancoSangue bancoSangue;
    private String horarioMarcado;

    public DoacaoDto(Doacao doacao){
        this.id = doacao.getId();
        this.usuarioId = doacao.getUsuarioId();
        this.bancoSangue = doacao.getBancoSangue();
        this.horarioMarcado = doacao.getHorarioMarcado();
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public Long getUsuarioId() {return usuarioId;}
    public void setUsuarioId(Long usuarioId) {this.usuarioId = usuarioId;}

    public String getHorarioMarcado() {return horarioMarcado;}
    public void setHorarioMarcado(String horarioMarcado) {this.horarioMarcado = horarioMarcado;}

    public static List<DoacaoDto> converter(List<Doacao> doacao){
        return doacao.stream().map(DoacaoDto::new).collect(Collectors.toList());
    }

    public BancoSangue getBancoSangue() {
        return bancoSangue;
    }

    public void setBancoSangue(BancoSangue bancoSangue) {
        this.bancoSangue = bancoSangue;
    }
}
