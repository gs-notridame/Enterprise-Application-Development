package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "TB_TELEFONE")
public class Telefone {

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "PESSOA",
            referencedColumnName = "COD_PESSOA",
            foreignKey = @ForeignKey(name = "FK_TELEFONE_PESSOA")
    )
    private Pessoa pessoa;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TELEFONE")
    @SequenceGenerator(name = "SQ_TELEFONE", sequenceName = "SQ_TELEFONE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_TELEFONE")
    private Long codTelefone;
    @Column(name = "NUMERO")
    private BigDecimal numero;
    @Column(name = "DDD")
    private BigDecimal ddd;

    public Telefone() {
    }

    public Telefone(Long codTelefone, BigDecimal numero, BigDecimal ddd) {
        this.codTelefone = codTelefone;
        this.numero = numero;
        this.ddd = ddd;
    }

    public Long getCodTelefone() {
        return codTelefone;
    }

    public Telefone setCodTelefone(Long codTelefone) {
        this.codTelefone = codTelefone;
        return this;
    }

    public BigDecimal getNumero() {
        return numero;
    }

    public Telefone setNumero(BigDecimal numero) {
        this.numero = numero;
        return this;
    }

    public BigDecimal getDdd() {
        return ddd;
    }

    public Telefone setDdd(BigDecimal ddd) {
        this.ddd = ddd;
        return this;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codTelefone=" + codTelefone +
                ", numero=" + numero +
                ", ddd=" + ddd +
                '}';
    }
}
