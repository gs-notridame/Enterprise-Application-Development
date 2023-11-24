package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "TB_AGENDAMENTO")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_AGENDAMENTO")
    @SequenceGenerator(name = "SQ_AGENDAMENTO", sequenceName = "AGENDAMENTO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_AGENDAMENTO")
    private BigDecimal codAgendamento;
    @Column(name = "DATA_AGENDAMENTO")
    private Date dataAgendamento;
    @Column(name = "HORA_AGENDAMENTO")
    private Time horaAgendamento;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "OBESERVACOES")
    private String observacoes;

    public Agendamento() {
    }

    public Agendamento(BigDecimal codAgendamento, Date dataAgendamento, Time horaAgendamento, String status, String observacoes) {
        this.codAgendamento = codAgendamento;
        this.dataAgendamento = dataAgendamento;
        this.horaAgendamento = horaAgendamento;
        this.status = status;
        this.observacoes = observacoes;
    }

    public BigDecimal getCodAgendamento() {
        return codAgendamento;
    }

    public Agendamento setCodAgendamento(BigDecimal codAgendamento) {
        this.codAgendamento = codAgendamento;
        return this;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public Agendamento setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
        return this;
    }

    public Time getHoraAgendamento() {
        return horaAgendamento;
    }

    public Agendamento setHoraAgendamento(Time horaAgendamento) {
        this.horaAgendamento = horaAgendamento;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Agendamento setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Agendamento setObservacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "codAgendamento=" + codAgendamento +
                ", dataAgendamento=" + dataAgendamento +
                ", horaAgendamento=" + horaAgendamento +
                ", status='" + status + '\'' +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
