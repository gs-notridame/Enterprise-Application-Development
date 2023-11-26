package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_RECOMENDACAO")
public class Recomendacao {
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "DIAGNOSTICO",
            referencedColumnName = "COD_DIAGNOSTICO",
            foreignKey = @ForeignKey(name = "FK_RECOMENDACAO_DIAGNOSTICO")
    )
    private Diagnostico diagnostico;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_RECOMENDACAO")
    @SequenceGenerator(name = "SQ_RECOMENDACAO", sequenceName = "SQ_RECOMENDACAO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_RECOMENDACAO")
    private BigDecimal codRecomendacao;
    @Column(name = "RECOMENDACAO")
    private String recomendacao;

    public Recomendacao() {
    }

    public Recomendacao(BigDecimal codRecomendacao, String recomendacao) {
        this.codRecomendacao = codRecomendacao;
        this.recomendacao = recomendacao;
    }

    public BigDecimal getCodRecomendacao() {
        return codRecomendacao;
    }

    public Recomendacao setCodRecomendacao(BigDecimal codRecomendacao) {
        this.codRecomendacao = codRecomendacao;
        return this;
    }

    public String getRecomendacao() {
        return recomendacao;
    }

    public Recomendacao setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
        return this;
    }

    @Override
    public String toString() {
        return "Recomendacao{" +
                "codRecomendacao=" + codRecomendacao +
                ", recomendacao='" + recomendacao + '\'' +
                '}';
    }
}
