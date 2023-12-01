package br.com.psycheck.domain.entity;

import br.com.psycheck.domain.entity.pessoa.Medico;
import jakarta.persistence.*;

@Entity
@Table(name = "ESPECIALIDADE")
public class Especialidade {



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESPECIALIDADE")
    @SequenceGenerator(name = "SQ_ESPECIALIDADE", sequenceName = "SQ_ESPECIALIDADE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_ESPECIALIDADE")
    private Long codEspecialidade;
    @Column(name = "ESPECIALIDADE")
    private String especialidae;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "MEDICO",
            referencedColumnName = "COD_MEDICO",
            foreignKey = @ForeignKey(name = "FK_ESPECIALIDADE_MEDICO")
    )
    private Medico medico;

    public Especialidade() {
    }

    public Especialidade(Long codEspecialidade, String especialidae, Medico medico) {
        this.codEspecialidade = codEspecialidade;
        this.especialidae = especialidae;
        this.medico = medico;
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

    public Medico getMedico() {
        return medico;
    }

    public Especialidade setMedico(Medico medico) {
        this.medico = medico;
        return this;
    }

    @Override
    public String toString() {
        return "Especialidade{" +
                "codEspecialidade=" + codEspecialidade +
                ", especialidae='" + especialidae + '\'' +
                ", medico=" + medico +
                '}';
    }
}
