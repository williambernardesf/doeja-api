package br.com.doeja.controller.form;

import br.com.doeja.modelo.PreTriagem;
import br.com.doeja.repository.PreTriagemRepository;

public class PreTriagemForm {

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

    public PreTriagem converter(PreTriagemRepository repository){
        return new PreTriagem(usuarioId, tatuagem, droga, dst, ist, cancer, transplante);
    }

}
