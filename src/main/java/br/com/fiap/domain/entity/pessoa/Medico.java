package br.com.fiap.domain.entity.pessoa;

import jakarta.persistence.*;

@Entity
@Table(name = "MEDICO")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_MEDICO")
    @SequenceGenerator(name = "SQ_MEDICO", sequenceName = "SQ_MEDICO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_MEDICO")
    private Long codMedico;
    @Column(name = "CRP")
    private String crp;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "PESSOA", referencedColumnName = "COD_PESSOA", foreignKey = @ForeignKey(name = "fk_paciente_pessoa"))
    private PessoaFisica pessoa;

    public Medico() {
    }

    public Medico(Long codMedico, String crp, PessoaFisica pessoa) {
        this.codMedico = codMedico;
        this.crp = crp;
        this.pessoa = pessoa;
    }

    public Long getCodMedico() {
        return codMedico;
    }

    public Medico setCodMedico(Long codMedico) {
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

    public PessoaFisica getPessoa() {
        return pessoa;
    }

    public Medico setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "codMedico=" + codMedico +
                ", crp='" + crp + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
