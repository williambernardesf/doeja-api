package br.com.doeja.controller.form;

import br.com.doeja.modelo.BancoSangue;
import br.com.doeja.repository.BancoSangueRepository;

public class AtualizacaoBancoSangue {

    private String sangueAMais;
    private String sangueAMenos;
    private String sangueBMais;
    private String sangueBMenos;
    private String sangueABMais;
    private String sangueABMenos;
    private String sangueOMais;
    private String sangueOMenos;

    public void setSangueAMais(String sangueAMais) {this.sangueAMais = sangueAMais;}

    public void setSangueAMenos(String sangueAMenos) {this.sangueAMenos = sangueAMenos;}

    public void setSangueBMais(String sangueBMais) {this.sangueBMais = sangueBMais;}

    public void setSangueBMenos(String sangueBMenos) {this.sangueBMenos = sangueBMenos;}

    public void setSangueABMais(String sangueABMais) {this.sangueABMais = sangueABMais;}

    public void setSangueABMenos(String sangueABMenos) {this.sangueABMenos = sangueABMenos;}

    public void setSangueOMais(String sangueOMais) {this.sangueOMais = sangueOMais;}

    public void setSangueOMenos(String sangueOMenos) {this.sangueOMenos = sangueOMenos;}

    public BancoSangue atualizar(Long id, BancoSangueRepository repository){

        BancoSangue bancoSangue = repository.getOne(id);

        bancoSangue.setSangueAMais(this.sangueAMais);
        bancoSangue.setSangueAMenos(this.sangueAMenos);
        bancoSangue.setSangueBMais(this.sangueBMais);
        bancoSangue.setSangueBMenos(this.sangueBMenos);
        bancoSangue.setSangueABMais(this.sangueABMais);
        bancoSangue.setSangueABMenos(this.sangueABMenos);
        bancoSangue.setSangueOMais(this.sangueOMais);
        bancoSangue.setSangueOMenos(this.sangueOMenos);
        repository.save(bancoSangue);

        return bancoSangue;
    }
}