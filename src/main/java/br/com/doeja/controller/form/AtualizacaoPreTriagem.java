package br.com.doeja.controller.form;

import br.com.doeja.modelo.PreTriagem;
import br.com.doeja.repository.PreTriagemRepository;

public class AtualizacaoPreTriagem {

    private Long usuarioId;
    private Boolean tatuagem;
    private Boolean droga;
    private Boolean dst;
    private Boolean ist;
    private Boolean cancer;
    private Boolean transplante;

    public void setUsuarioId(Long usuarioId) {this.usuarioId = usuarioId;}
    public void setTatuagem(Boolean tatuagem) {this.tatuagem = tatuagem;}
    public void setDroga(Boolean droga) {this.droga = droga;}
    public void setDst(Boolean dst) {this.dst = dst;}
    public void setIst(Boolean ist) {this.ist = ist;}
    public void setCancer(Boolean cancer) {this.cancer = cancer;}
    public void setTransplante(Boolean transplante) {this.transplante = transplante;}

    public PreTriagem atualizar(Long id, PreTriagemRepository repository){

        PreTriagem preTriagem = repository.getOne(id);

        preTriagem.setUsuarioId(this.usuarioId);
        preTriagem.setTatuagem(this.tatuagem);
        preTriagem.setDroga(this.droga);
        preTriagem.setDst(this.dst);
        preTriagem.setIst(this.ist);
        preTriagem.setCancer(this.cancer);
        preTriagem.setTransplante(this.transplante);
        repository.save(preTriagem);
        return preTriagem;
    }
}
