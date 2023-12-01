package br.com.psycheck.domain.entity;
import br.com.psycheck.domain.entity.pessoa.Medico;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "DIAGNOSTICO")
public class Diagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DIAGNOSTICO")
    @SequenceGenerator(name = "SQ_DIAGNOSTICO", sequenceName = "SQ_DIAGNOSTICO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_DIAGNOSTICO")
    private Long codDiagnostico;
    @Column(name = "DATA_GERACAO")
    private LocalDate dataGeracao;
    @Column(name = "RESULTADO")
    private String resultado;
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "SEGMENTO_ACAO")
    private String segmentoAcao;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "MEDICO",
            referencedColumnName = "COD_MEDICO",
            foreignKey = @ForeignKey(name = "FK_DIAGNOSTICO_MEDICO")
    )
    private Medico medico;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "TRIAGEM", referencedColumnName = "COD_TRIAGEM", foreignKey = @ForeignKey(name = "fk_diagnostico_triagem"))
    private Triagem triagem;

    public Diagnostico() {
    }

    public Diagnostico(Long codDiagnostico, LocalDate dataGeracao, String resultado, String observacao, String segmentoAcao, Medico medico, Triagem triagem) {
        this.codDiagnostico = codDiagnostico;
        this.dataGeracao = dataGeracao;
        this.resultado = resultado;
        this.observacao = observacao;
        this.segmentoAcao = segmentoAcao;
        this.medico = medico;
        this.triagem = triagem;
    }

    public Long getCodDiagnostico() {
        return codDiagnostico;
    }

    public Diagnostico setCodDiagnostico(Long codDiagnostico) {
        this.codDiagnostico = codDiagnostico;
        return this;
    }

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public Diagnostico setDataGeracao(LocalDate dataGeracao) {
        this.dataGeracao = dataGeracao;
        return this;
    }

    public String getResultado() {
        return resultado;
    }

    public Diagnostico setResultado(String resultado) {
        this.resultado = resultado;
        return this;
    }

    public String getObservacao() {
        return observacao;
    }

    public Diagnostico setObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public String getSegmentoAcao() {
        return segmentoAcao;
    }

    public Diagnostico setSegmentoAcao(String segmentoAcao) {
        this.segmentoAcao = segmentoAcao;
        return this;
    }

    public Medico getMedico() {
        return medico;
    }

    public Diagnostico setMedico(Medico medico) {
        this.medico = medico;
        return this;
    }

    public Triagem getTriagem() {
        return triagem;
    }

    public Diagnostico setTriagem(Triagem triagem) {
        this.triagem = triagem;
        return this;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "codDiagnostico=" + codDiagnostico +
                ", dataGeracao=" + dataGeracao +
                ", resultado='" + resultado + '\'' +
                ", observacao='" + observacao + '\'' +
                ", segmentoAcao='" + segmentoAcao + '\'' +
                ", medico=" + medico +
                ", triagem=" + triagem +
                '}';
    }
}
