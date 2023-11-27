package br.com.fiap.domain.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "TB_DIAGNOSTICO")
public class Diagnostico {

    @OneToOne
    @JoinColumn(name = "COD_TRIAGEM")
    private Triagem triagem;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DIAGNOSTICO")
    @SequenceGenerator(name = "SQ_DIAGNOSTICO", sequenceName = "SQ_DIAGNOSTICO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_DIAGNOSTICO")
    private Long codDiagnostico;
    @Column(name = "DATA_GERACAO")
    private Date dataGeracao;
    @Column(name = "RESULTADO")
    private String resultado;
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "SEGMENTO_ACAO")
    private String segmentoAcao;

    public Diagnostico() {
    }

    public Diagnostico(Long codDiagnostico, Date dataGeracao, String resultado, String observacao, String segmentoAcao) {
        this.codDiagnostico = codDiagnostico;
        this.dataGeracao = dataGeracao;
        this.resultado = resultado;
        this.observacao = observacao;
        this.segmentoAcao = segmentoAcao;
    }

    public Long getCodDiagnostico() {
        return codDiagnostico;
    }

    public Diagnostico setCodDiagnostico(Long codDiagnostico) {
        this.codDiagnostico = codDiagnostico;
        return this;
    }

    public Date getDataGeracao() {
        return dataGeracao;
    }

    public Diagnostico setDataGeracao(Date dataGeracao) {
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

    @Override
    public String toString() {
        return "Diagnostico{" +
                "codDiagnostico=" + codDiagnostico +
                ", dataGeracao=" + dataGeracao +
                ", resultado='" + resultado + '\'' +
                ", observacao='" + observacao + '\'' +
                ", segmentoAcao='" + segmentoAcao + '\'' +
                '}';
    }
}
