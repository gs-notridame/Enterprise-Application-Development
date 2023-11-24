package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "TB_ESPECIALIDADE")
public class Especialidade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESPECIALIDADE")
    @SequenceGenerator(name = "SQ_ESPECIALIDADE", sequenceName = "SQ_ESPECIALIDADE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_ESPECIALIDADE")
    private BigDecimal codEspecialidade;
    @Column(name = "ESPECIALIDADE")
    private String especialidae;

    public Especialidade() {
    }

    public Especialidade(BigDecimal codEspecialidade, String especialidae) {
        this.codEspecialidade = codEspecialidade;
        this.especialidae = especialidae;
    }

    public BigDecimal getCodEspecialidade() {
        return codEspecialidade;
    }

    public Especialidade setCodEspecialidade(BigDecimal codEspecialidade) {
        this.codEspecialidade = codEspecialidade;
        return this;
    }

    public String getEspecialidae() {
        return especialidae;
    }

    public Especialidade setEspecialidae(String especialidae) {
        this.especialidae = especialidae;
        return this;
    }

    @Override
    public String toString() {
        return "Especialidade{" +
                "codEspecialidade=" + codEspecialidade +
                ", especialidae='" + especialidae + '\'' +
                '}';
    }
}
