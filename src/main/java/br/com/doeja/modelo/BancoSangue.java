package br.com.doeja.modelo;

import javax.persistence.*;

@Entity
public class BancoSangue {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public BancoSangue() {
    }

    public BancoSangue(String nome, String rua, String numero, String bairro, String cidade, String uf,
                       String sangueAMais, String sangueAMenos, String sangueBMais, String sangueBMenos,
                       String sangueABMais, String sangueABMenos, String sangueOMais, String sangueOMenos) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.sangueAMais = sangueAMais;
        this.sangueAMenos = sangueAMenos;
        this.sangueBMais = sangueBMais;
        this.sangueBMenos = sangueBMenos;
        this.sangueABMais = sangueABMais;
        this.sangueABMenos = sangueABMenos;
        this.sangueOMais = sangueOMais;
        this.sangueOMenos = sangueOMenos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getSangueAMais() {
        return sangueAMais;
    }

    public void setSangueAMais(String sangueAMais) {
        this.sangueAMais = sangueAMais;
    }

    public String getSangueAMenos() {
        return sangueAMenos;
    }

    public void setSangueAMenos(String sangueAMenos) {
        this.sangueAMenos = sangueAMenos;
    }

    public String getSangueBMais() {
        return sangueBMais;
    }

    public void setSangueBMais(String sangueBMais) {
        this.sangueBMais = sangueBMais;
    }

    public String getSangueBMenos() {
        return sangueBMenos;
    }

    public void setSangueBMenos(String sangueBMenos) {
        this.sangueBMenos = sangueBMenos;
    }

    public String getSangueABMais() {
        return sangueABMais;
    }

    public void setSangueABMais(String sangueABMais) {
        this.sangueABMais = sangueABMais;
    }

    public String getSangueABMenos() {
        return sangueABMenos;
    }

    public void setSangueABMenos(String sangueABMenos) {
        this.sangueABMenos = sangueABMenos;
    }

    public String getSangueOMais() {
        return sangueOMais;
    }

    public void setSangueOMais(String sangueOMais) {
        this.sangueOMais = sangueOMais;
    }

    public String getSangueOMenos() {
        return sangueOMenos;
    }

    public void setSangueOMenos(String sangueOMenos) {
        this.sangueOMenos = sangueOMenos;
    }
}
