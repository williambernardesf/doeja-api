package br.com.doeja.controller.form;

import br.com.doeja.modelo.BancoSangue;
import br.com.doeja.repository.BancoSangueRepository;

public class BancoSangueForm {

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setSangueAMais(String sangueAMais) {
        this.sangueAMais = sangueAMais;
    }

    public void setSangueAMenos(String sangueAMenos) {
        this.sangueAMenos = sangueAMenos;
    }

    public void setSangueBMais(String sangueBMais) {
        this.sangueBMais = sangueBMais;
    }

    public void setSangueBMenos(String sangueBMenos) {
        this.sangueBMenos = sangueBMenos;
    }

    public void setSangueABMais(String sangueABMais) {
        this.sangueABMais = sangueABMais;
    }

    public void setSangueABMenos(String sangueABMenos) {
        this.sangueABMenos = sangueABMenos;
    }

    public void setSangueOMais(String sangueOMais) {
        this.sangueOMais = sangueOMais;
    }

    public void setSangueOMenos(String sangueOMenos) {
        this.sangueOMenos = sangueOMenos;
    }

    public BancoSangue converter(BancoSangueRepository repository){
        return new BancoSangue(nome, rua, numero, bairro, cidade, uf, sangueAMais, sangueAMenos,
                sangueBMais, sangueBMenos, sangueABMais, sangueABMenos, sangueOMais, sangueOMenos);
    }
}