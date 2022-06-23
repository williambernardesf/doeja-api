package br.com.doeja.controller.dto;

import br.com.doeja.modelo.PreTriagem;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PreTriagemDto {

    private Long id;
    private Long usuarioId;
    private Boolean tatuagem;
    private Boolean droga;
    private Boolean dst;
    private Boolean ist;
    private Boolean cancer;
    private Boolean transplante;

    public PreTriagemDto(PreTriagem preTriagem){
        this.id = preTriagem.getId();
        this.usuarioId = preTriagem.getUsuarioId();
        this.tatuagem = preTriagem.getTatuagem();
        this.droga = preTriagem.getDroga();
        this.dst = preTriagem.getDst();
        this.ist = preTriagem.getIst();
        this.cancer = preTriagem.getCancer();
        this.transplante = preTriagem.getTransplante();
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public Long getUsuarioId() {return usuarioId;}
    public void setUsuarioId(Long usuarioId) {this.usuarioId = usuarioId;}
    public Boolean getTatuagem() {return tatuagem;}
    public void setTatuagem(Boolean tatuagem) {this.tatuagem = tatuagem;}
    public Boolean getDroga() {return droga;}
    public void setDroga(Boolean droga) {this.droga = droga;}
    public Boolean getDst() {return dst;}
    public void setDst(Boolean dst) {this.dst = dst;}
    public Boolean getIst() {return ist;}
    public void setIst(Boolean ist) {this.ist = ist;}
    public Boolean getCancer() {return cancer;}
    public void setCancer(Boolean cancer) {this.cancer = cancer;}
    public Boolean getTransplante() {return transplante;}
    public void setTransplante(Boolean transplante) {this.transplante = transplante;}

    public static List<PreTriagemDto> converter(List<PreTriagem> preTriagem){
        return preTriagem.stream().map(PreTriagemDto::new).collect(Collectors.toList());

    }
}
