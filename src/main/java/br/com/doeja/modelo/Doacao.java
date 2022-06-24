package br.com.doeja.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long usuarioId;
    private Long bancoSangueId;
    private String horarioMarcado;

    public Doacao() {
    }

    public Doacao(Long usuarioId, Long bancoSangueId, String horarioMarcado) {
        this.usuarioId = usuarioId;
        this.bancoSangueId = bancoSangueId;
        this.horarioMarcado = horarioMarcado;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public Long getUsuarioId() {return usuarioId;}
    public void setUsuarioId(Long usuarioId) {this.usuarioId = usuarioId;}
    public Long getBancoSangueId() {return bancoSangueId;}
    public void setBancoSangueId(Long bancoSangueId) {this.bancoSangueId = bancoSangueId;}
    public String getHorarioMarcado() {return horarioMarcado;}
    public void setHorarioMarcado(String horarioMarcado) {this.horarioMarcado = horarioMarcado;}
}
