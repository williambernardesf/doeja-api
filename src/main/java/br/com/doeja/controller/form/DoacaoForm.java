package br.com.doeja.controller.form;

import br.com.doeja.modelo.Doacao;
import br.com.doeja.repository.BancoSangueRepository;
import br.com.doeja.repository.DoacaoRepository;

import java.time.LocalDateTime;

public class DoacaoForm {

    private Long usuarioId;
    private Long bancoSangueId;
    private String horarioMarcado;

    public void setUsuarioId(Long usuarioId) {this.usuarioId = usuarioId;}
    public void setBancoSangueId(Long bancoSangueId) {this.bancoSangueId = bancoSangueId;}
    public void setHorarioMarcado(String horarioMarcado) {this.horarioMarcado = horarioMarcado;}

    public Doacao converter(DoacaoRepository repository){
        return new Doacao(usuarioId, bancoSangueId, horarioMarcado);
    }
}
