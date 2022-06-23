package br.com.doeja.modelo;

import javax.persistence.*;

@Entity
public class PreTriagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    private Boolean tatuagem;
    private Boolean droga;
    private Boolean dst;
    private Boolean ist;
    private Boolean cancer;
    private Boolean transplante;

    public PreTriagem() {
    }

    public PreTriagem(Long usuarioId, Boolean tatuagem, Boolean droga,
                      Boolean dst, Boolean ist, Boolean cancer, Boolean transplante) {
        this.usuarioId = usuarioId;
        this.tatuagem = tatuagem;
        this.droga = droga;
        this.dst = dst;
        this.ist = ist;
        this.cancer = cancer;
        this.transplante = transplante;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
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
    public Long getUsuarioId() {return usuarioId;}
}
