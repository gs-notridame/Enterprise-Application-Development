package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_MEDICO")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_MEDICO")
    @SequenceGenerator(name = "SQ_MEDICO", sequenceName = "SQ_MEDICO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_MEDICO")
    private BigDecimal codMedico;
    @Column(name = "CRP")
    private String crp;

    public Medico() {
    }
    public Medico(BigDecimal codMedico, String crp) {
        this.codMedico = codMedico;
        this.crp = crp;
    }

    public BigDecimal getCodMedico() {
        return codMedico;
    }

    public Medico setCodMedico(BigDecimal codMedico) {
        this.codMedico = codMedico;
        return this;
    }

    public String getCrp() {
        return crp;
    }

    public Medico setCrp(String crp) {
        this.crp = crp;
        return this;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "codMedico=" + codMedico +
                ", crp='" + crp + '\'' +
                '}';
    }
}
