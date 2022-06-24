package br.com.doeja.modelo;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;

    @ManyToOne()
    @JoinColumn(name = "banco_sangue_id")
    private BancoSangue bancoSangue;
    private String horarioMarcado;

    public Doacao() {
    }

    public Doacao(Long usuarioId, BancoSangue bancoSangue, String horarioMarcado) {
        this.usuarioId = usuarioId;
        this.bancoSangue = bancoSangue;
        this.horarioMarcado = horarioMarcado;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public Long getUsuarioId() {return usuarioId;}
    public void setUsuarioId(Long usuarioId) {this.usuarioId = usuarioId;}

    public String getHorarioMarcado() {return horarioMarcado;}
    public void setHorarioMarcado(String horarioMarcado) {this.horarioMarcado = horarioMarcado;}

    public BancoSangue getBancoSangue() {
        return bancoSangue;
    }

    public void setBancoSangue(BancoSangue bancoSangue) {
        this.bancoSangue = bancoSangue;
    }
}
