package br.com.doeja.controller.dto;

import br.com.doeja.modelo.BancoSangue;

import java.util.List;
import java.util.stream.Collectors;

public class BancoSangueDto {

    private Long id;
    private String nome;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;
    private String sangueAMais;
    private String sangueAMenos;
    private String sangueBMais;
    private String sangueBMenos;
    private String sangueABMais;
    private String sangueABMenos;
    private String sangueOMais;
    private String sangueOMenos;

    public BancoSangueDto(BancoSangue hemobanco){
        this.id = hemobanco.getId();
        this.nome = hemobanco.getNome();
        this.rua = hemobanco.getRua();
        this.numero = hemobanco.getNumero();
        this.bairro = hemobanco.getBairro();
        this.cidade = hemobanco.getCidade();
        this.uf = hemobanco.getUf();
        this.sangueAMais = hemobanco.getSangueAMais();
        this.sangueAMenos = hemobanco.getSangueAMenos();
        this.sangueBMais = hemobanco.getSangueBMais();
        this.sangueBMenos = hemobanco.getSangueBMenos();
        this.sangueABMais = hemobanco.getSangueABMais();
        this.sangueABMenos = hemobanco.getSangueABMenos();
        this.sangueOMais = hemobanco.getSangueOMais();
        this.sangueOMenos = hemobanco.getSangueOMenos();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getSangueAMais() {
        return sangueAMais;
    }

    public String getSangueAMenos() {
        return sangueAMenos;
    }

    public String getSangueBMais() {
        return sangueBMais;
    }

    public String getSangueBMenos() {
        return sangueBMenos;
    }

    public String getSangueABMais() {
        return sangueABMais;
    }

    public String getSangueABMenos() {
        return sangueABMenos;
    }

    public String getSangueOMais() {
        return sangueOMais;
    }

    public String getSangueOMenos() {
        return sangueOMenos;
    }

    public static List<BancoSangueDto> converter(List<BancoSangue> hemobancos) {
        return hemobancos.stream().map(BancoSangueDto::new).collect(Collectors.toList());
    }
}
