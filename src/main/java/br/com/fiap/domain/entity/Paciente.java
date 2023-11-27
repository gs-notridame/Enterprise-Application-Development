package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "TB_PACIENTE")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PACIENTE")
    @SequenceGenerator(name = "SQ_PACIENTE", sequenceName = "SQ_PACIENTE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PACIENTE")
    private Long codPaciente;
    @Column(name = "HISTORICO")
    private String historico;
    @Column(name = "NUM_SEGURO_SAUDE")
    private BigDecimal numSeguroSaude;

    public Paciente() {
    }

    public Paciente(Long codPaciente, String historico, BigDecimal numSeguroSaude) {
        this.codPaciente = codPaciente;
        this.historico = historico;
        this.numSeguroSaude = numSeguroSaude;
    }

    public Long getCodPaciente() {
        return codPaciente;
    }

    public Paciente setCodPaciente(Long codPaciente) {
        this.codPaciente = codPaciente;
        return this;
    }

    public String getHistorico() {
        return historico;
    }

    public Paciente setHistorico(String historico) {
        this.historico = historico;
        return this;
    }

    public BigDecimal getNumSeguroSaude() {
        return numSeguroSaude;
    }

    public Paciente setNumSeguroSaude(BigDecimal numSeguroSaude) {
        this.numSeguroSaude = numSeguroSaude;
        return this;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "codPaciente=" + codPaciente +
                ", historico='" + historico + '\'' +
                ", numSeguroSaude=" + numSeguroSaude +
                '}';
    }
}
