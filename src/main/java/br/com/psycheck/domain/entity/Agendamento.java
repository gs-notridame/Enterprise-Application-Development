package br.com.psycheck.domain.entity;

import br.com.psycheck.domain.entity.pessoa.Paciente;
import jakarta.persistence.*;
import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_AGENDAMENTO")
    @SequenceGenerator(name = "SQ_AGENDAMENTO", sequenceName = "SQ_AGENDAMENTO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_AGENDAMENTO")
    private Long codAgendamento;
    @Column(name = "DATA_AGENDAMENTO")
    private LocalDate dataAgendamento;
    @Column(name = "HORA_AGENDAMENTO")
    private Time horaAgendamento;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "OBSERVACOES")
    private String observacoes;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "PACIENTE",
            referencedColumnName = "COD_PACIENTE",
            foreignKey = @ForeignKey(name = "FK_AGENDAMENTO_PACIENTE")
    )
    private Paciente paciente;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "AGENDA_MEDICO",
            referencedColumnName = "COD_AGENDA_MEDICO",
            foreignKey = @ForeignKey(name = "FK_AGENDAMENTO_AGENDA_MEDICO")
    )
    private AgendaMedico agendaMedico;

    public Agendamento() {
    }

    public Agendamento(Long codAgendamento, LocalDate dataAgendamento, Time horaAgendamento, String status, String observacoes, Paciente paciente, AgendaMedico agendaMedico) {
        this.codAgendamento = codAgendamento;
        this.dataAgendamento = dataAgendamento;
        this.horaAgendamento = horaAgendamento;
        this.status = status;
        this.observacoes = observacoes;
        this.paciente = paciente;
        this.agendaMedico = agendaMedico;
    }

    public Long getCodAgendamento() {
        return codAgendamento;
    }

    public Agendamento setCodAgendamento(Long codAgendamento) {
        this.codAgendamento = codAgendamento;
        return this;
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public Agendamento setDataAgendamento(LocalDate dataAgendamento) {
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

    public Paciente getPaciente() {
        return paciente;
    }

    public Agendamento setPaciente(Paciente paciente) {
        this.paciente = paciente;
        return this;
    }

    public AgendaMedico getAgendaMedico() {
        return agendaMedico;
    }

    public Agendamento setAgendaMedico(AgendaMedico agendaMedico) {
        this.agendaMedico = agendaMedico;
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
                ", paciente=" + paciente +
                ", agendaMedico=" + agendaMedico +
                '}';
    }
}
