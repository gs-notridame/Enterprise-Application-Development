package br.com.fiap.domain.entity;

import br.com.fiap.domain.entity.pessoa.Paciente;
import jakarta.persistence.*;
import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "AGENDAMENTO")
public class Agendamento {

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "PACIENTE",
            referencedColumnName = "COD_PACIENTE",
            foreignKey = @ForeignKey(name = "FK_AGENDAMENTO_PACIENTE")
    )
    private Paciente paciente;

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


    public Agendamento() {
    }

    public Agendamento(Long codAgendamento, LocalDate dataAgendamento, Time horaAgendamento, String status, String observacoes) {
        this.codAgendamento = codAgendamento;
        this.dataAgendamento = dataAgendamento;
        this.horaAgendamento = horaAgendamento;
        this.status = status;
        this.observacoes = observacoes;
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
