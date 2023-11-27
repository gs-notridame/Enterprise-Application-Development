package br.com.fiap.domain.entity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Time;

@Entity
@Table(name = "TB_AGENDA_MEDICA")
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
    private BigDecimal codAgenda;
    @Column(name = "DATA_AGENDAMENTO")
    private Date dataAgendamento;
    @Column(name = "HORA_AGENDAMENTO")
    private Time horaAgendamento;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "OBESERVACOES")
    private String oberservacoes;

    public agendaMedica() {
    }

    public agendaMedica(BigDecimal codAgenda, Date dataAgendamento, Time horaAgendamento, String status, String oberservacoes) {
        this.codAgenda = codAgenda;
        this.dataAgendamento = dataAgendamento;
        this.horaAgendamento = horaAgendamento;
        this.status = status;
        this.oberservacoes = oberservacoes;
    }

    public BigDecimal getCodAgenda() {
        return codAgenda;
    }

    public agendaMedica setCodAgenda(BigDecimal codAgenda) {
        this.codAgenda = codAgenda;
        return this;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public agendaMedica setDataAgendamento(Date dataAgendamento) {
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

    public String getOberservacoes() {
        return oberservacoes;
    }

    public agendaMedica setOberservacoes(String oberservacoes) {
        this.oberservacoes = oberservacoes;
        return this;
    }

    @Override
    public String toString() {
        return "agendaMedica{" +
                "codAgenda=" + codAgenda +
                ", dataAgendamento=" + dataAgendamento +
                ", horaAgendamento=" + horaAgendamento +
                ", status='" + status + '\'' +
                ", oberservacoes='" + oberservacoes + '\'' +
                '}';
    }
}
