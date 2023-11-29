package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "TELEFONE")
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
    private Long numero;
    @Column(name = "DDD")
    private Long ddd;

    public Telefone() {
    }

    public Telefone(Long codTelefone, Long numero, Long ddd) {
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

    public Long getNumero() {
        return numero;
    }

    public Telefone setNumero(Long numero) {
        this.numero = numero;
        return this;
    }

    public Long getDdd() {
        return ddd;
    }

    public Telefone setDdd(Long ddd) {
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
