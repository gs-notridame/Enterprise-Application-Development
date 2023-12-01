package br.com.psycheck.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "RECOMENDACAO")
public class Recomendacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_RECOMENDACAO")
    @SequenceGenerator(name = "SQ_RECOMENDACAO", sequenceName = "SQ_RECOMENDACAO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_RECOMENDACAO")
    private Long codRecomendacao;
    @Column(name = "RECOMENDACAO")
    private String recomendacao;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "DIAGNOSTICO",
            referencedColumnName = "COD_DIAGNOSTICO",
            foreignKey = @ForeignKey(name = "FK_RECOMENDACAO_DIAGNOSTICO")
    )
    private Diagnostico diagnostico;

    public Recomendacao() {
    }

    public Recomendacao(Long codRecomendacao, String recomendacao, Diagnostico diagnostico) {
        this.codRecomendacao = codRecomendacao;
        this.recomendacao = recomendacao;
        this.diagnostico = diagnostico;
    }

    public Long getCodRecomendacao() {
        return codRecomendacao;
    }

    public Recomendacao setCodRecomendacao(Long codRecomendacao) {
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

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public Recomendacao setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
        return this;
    }

    @Override
    public String toString() {
        return "Recomendacao{" +
                "codRecomendacao=" + codRecomendacao +
                ", recomendacao='" + recomendacao + '\'' +
                ", diagnostico=" + diagnostico +
                '}';
    }
}
