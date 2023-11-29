package br.com.fiap.domain.entity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.sql.Time;

@Entity
@Table(name = "AGENDA_MEDICA")
public class agendaMedica {
    @OneToOne
    @JoinColumn(name = "COD_MEDICO")
    private Medico medico;
    @OneToOne
    @JoinColumn(name = "COD_AGENDAMENTO")
    private Agendamento agendamento;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_AGENDA_MEDICA")
    @SequenceGenerator(name = "SQ_AGENDA_MEDICA", sequenceName = "SQ_AGENDA_MEDICA", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_AGENDA")
    private Long codAgenda;
    @Column(name = "DATA_AGENDAMENTO")
    private LocalDate dataAgendamento;
    @Column(name = "HORA_AGENDAMENTO")
    private Time horaAgendamento;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "OBESERVACOES")
    private String observacoes;

    public agendaMedica() {
    }

    public agendaMedica(Long codAgenda, LocalDate dataAgendamento, Time horaAgendamento, String status, String observacoes) {
        this.codAgenda = codAgenda;
        this.dataAgendamento = dataAgendamento;
        this.horaAgendamento = horaAgendamento;
        this.status = status;
        this.observacoes = observacoes;
    }

    public Long getCodAgenda() {
        return codAgenda;
    }

    public agendaMedica setCodAgenda(Long codAgenda) {
        this.codAgenda = codAgenda;
        return this;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public agendaMedica setDataAgendamento(LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
        return this;
    }

    public Time getHoraAgendamento() {
        return horaAgendamento;
    }

    public agendaMedica setHoraAgendamento(Time horaAgendamento) {
        this.horaAgendamento = horaAgendamento;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public agendaMedica setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public agendaMedica setObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    @Override
    public String toString() {
        return "agendaMedica{" +
                "codAgenda=" + codAgenda +
                ", dataAgendamento=" + dataAgendamento +
                ", horaAgendamento=" + horaAgendamento +
                ", status='" + status + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
