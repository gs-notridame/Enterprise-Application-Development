package br.com.psycheck.domain.entity;

import br.com.psycheck.domain.entity.pessoa.Medico;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "AGENDA_MEDICO")
public class AgendaMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_AGENDA_MEDICA")
    @SequenceGenerator(name = "SQ_AGENDA_MEDICA", sequenceName = "SQ_AGENDA_MEDICA", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_AGENDA_MEDICO")
    private Long codAgendaMedico;
    @Column(name = "DATA_DISPONIBILIDADE")
    private LocalDate dataDisponibilidade;
    @Column(name = "HORA_INICIO_DISPONIBILIDADE")
    private Time horaInicioDisponibilidade;
    @Column(name = "HORA_TERMINO_DISPONIBILIDADE")
    private Time horaTerminoDisponibilidade;
    @Column(name = "STATUS_DISPONIBILIDADE")
    private String statusDisponibilidade;
    @Column(name = "INTERVALO")
    private Time intervalo;
    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "MEDICO", referencedColumnName = "COD_MEDICO", foreignKey = @ForeignKey(name = "fk_agendaMedico_medico"))
    private Medico medico;

    public AgendaMedico() {
    }

    public AgendaMedico(Long codAgendaMedico, LocalDate dataDisponibilidade, Time horaInicioDisponibilidade, Time horaTerminoDisponibilidade, String statusDisponibilidade, Time intervalo, Medico medico) {
        this.codAgendaMedico = codAgendaMedico;
        this.dataDisponibilidade = dataDisponibilidade;
        this.horaInicioDisponibilidade = horaInicioDisponibilidade;
        this.horaTerminoDisponibilidade = horaTerminoDisponibilidade;
        this.statusDisponibilidade = statusDisponibilidade;
        this.intervalo = intervalo;
        this.medico = medico;
    }

    public Long getCodAgendaMedico() {
        return codAgendaMedico;
    }

    public AgendaMedico setCodAgendaMedico(Long codAgendaMedico) {
        this.codAgendaMedico = codAgendaMedico;
        return this;
    }

    public LocalDate getDataDisponibilidade() {
        return dataDisponibilidade;
    }

    public AgendaMedico setDataDisponibilidade(LocalDate dataDisponibilidade) {
        this.dataDisponibilidade = dataDisponibilidade;
        return this;
    }

    public Time getHoraInicioDisponibilidade() {
        return horaInicioDisponibilidade;
    }

    public AgendaMedico setHoraInicioDisponibilidade(Time horaInicioDisponibilidade) {
        this.horaInicioDisponibilidade = horaInicioDisponibilidade;
        return this;
    }

    public Time getHoraTerminoDisponibilidade() {
        return horaTerminoDisponibilidade;
    }

    public AgendaMedico setHoraTerminoDisponibilidade(Time horaTerminoDisponibilidade) {
        this.horaTerminoDisponibilidade = horaTerminoDisponibilidade;
        return this;
    }

    public String getStatusDisponibilidade() {
        return statusDisponibilidade;
    }

    public AgendaMedico setStatusDisponibilidade(String statusDisponibilidade) {
        this.statusDisponibilidade = statusDisponibilidade;
        return this;
    }

    public Time getIntervalo() {
        return intervalo;
    }

    public AgendaMedico setIntervalo(Time intervalo) {
        this.intervalo = intervalo;
        return this;
    }

    public Medico getMedico() {
        return medico;
    }

    public AgendaMedico setMedico(Medico medico) {
        this.medico = medico;
        return this;
    }

    @Override
    public String toString() {
        return "AgendaMedico{" +
                "codAgendaMedico=" + codAgendaMedico +
                ", dataDisponibilidade=" + dataDisponibilidade +
                ", horaInicioDisponibilidade=" + horaInicioDisponibilidade +
                ", horaTerminoDisponibilidade=" + horaTerminoDisponibilidade +
                ", statusDisponibilidade='" + statusDisponibilidade + '\'' +
                ", intervalo=" + intervalo +
                ", medico=" + medico +
                '}';
    }
}
