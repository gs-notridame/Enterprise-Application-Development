package br.com.fiap.domain.entity.pessoa;

import jakarta.persistence.*;

@Entity
@Table(name = "PACIENTE")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PACIENTE")
    @SequenceGenerator(name = "SQ_PACIENTE", sequenceName = "SQ_PACIENTE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PACIENTE")
    private Long codPaciente;
    @Column(name = "HISTORICO")
    private String historico;
    @Column(name = "NUM_SEGURO_SAUDE")
    private Long numSeguroSaude;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "PESSOA", referencedColumnName = "COD_PESSOA", foreignKey = @ForeignKey(name = "fk_paciente_pessoa"))
    private PessoaFisica pessoa;

    public Paciente() {
    }

    public Paciente(Long codPaciente, String historico, Long numSeguroSaude, PessoaFisica pessoa) {
        this.codPaciente = codPaciente;
        this.historico = historico;
        this.numSeguroSaude = numSeguroSaude;
        this.pessoa = pessoa;
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

    public Long getNumSeguroSaude() {
        return numSeguroSaude;
    }

    public Paciente setNumSeguroSaude(Long numSeguroSaude) {
        this.numSeguroSaude = numSeguroSaude;
        return this;
    }

    public PessoaFisica getPessoa() {
        return pessoa;
    }

    public Paciente setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "codPaciente=" + codPaciente +
                ", historico='" + historico + '\'' +
                ", numSeguroSaude=" + numSeguroSaude +
                ", pessoa=" + pessoa +
                '}';
    }
}
