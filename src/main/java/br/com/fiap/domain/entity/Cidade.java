package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "CIDADE")
public class Cidade {

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "ESTADO",
            referencedColumnName = "COD_ESTADO",
            foreignKey = @ForeignKey(name = "FK_CIDADE_ESTADO")
    )
    private Estado estado;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CIDADE")
    @SequenceGenerator(name = "SQ_CIDADE", sequenceName = "SQ_CIDADE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_CIDADE")
    private Long codCidade;
    @Column(name = "NOME")
    private  String nome;
    @Column(name = "COD_IBGE")
    private Long codIbge;

    public Cidade() {
    }

    public Cidade(Long codCidade, String nome, Long codIbge) {
        this.codCidade = codCidade;
        this.nome = nome;
        this.codIbge = codIbge;
    }

    public Long getCodCidade() {
        return codCidade;
    }

    public Cidade setCodCidade(Long codCidade) {
        this.codCidade = codCidade;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Cidade setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Long getCodIbge() {
        return codIbge;
    }

    public Cidade setCodIbge(Long codIbge) {
        this.codIbge = codIbge;
        return this;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "codCidade=" + codCidade +
                ", nome='" + nome + '\'' +
                ", codIbge=" + codIbge +
                '}';
    }
}