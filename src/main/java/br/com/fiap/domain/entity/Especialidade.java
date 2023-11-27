package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "TB_ESPECIALIDADE")
public class Especialidade {

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "MEDICO",
            referencedColumnName = "COD_MEDICO",
            foreignKey = @ForeignKey(name = "FK_ESPECIALIDADE_MEDICO")
    )
    private Medico medico;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESPECIALIDADE")
    @SequenceGenerator(name = "SQ_ESPECIALIDADE", sequenceName = "SQ_ESPECIALIDADE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_ESPECIALIDADE")
    private Long codEspecialidade;
    @Column(name = "ESPECIALIDADE")
    private String especialidae;

    public Especialidade() {
    }

    public Especialidade(Long codEspecialidade, String especialidae) {
        this.codEspecialidade = codEspecialidade;
        this.especialidae = especialidae;
    }

    public Long getCodEspecialidade() {
        return codEspecialidade;
    }

    public Especialidade setCodEspecialidade(Long codEspecialidade) {
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
