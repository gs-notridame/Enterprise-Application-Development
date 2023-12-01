package br.com.psycheck.domain.entity;

import br.com.psycheck.domain.entity.pessoa.Pessoa;
import jakarta.persistence.*;

@Entity
@Table(name = "TELEFONE")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TELEFONE")
    @SequenceGenerator(name = "SQ_TELEFONE", sequenceName = "SQ_TELEFONE", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_TELEFONE")
    private Long codTelefone;
    @Column(name = "NUMERO")
    private Long numero;
    @Column(name = "DDD")
    private Long ddd;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "PESSOA",
            referencedColumnName = "COD_PESSOA",
            foreignKey = @ForeignKey(name = "FK_TEL_PESSOA")
    )
    private Pessoa pessoa;

    public Telefone() {
    }

    public Telefone(Long codTelefone, Long numero, Long ddd, Pessoa pessoa) {
        this.codTelefone = codTelefone;
        this.numero = numero;
        this.ddd = ddd;
        this.pessoa = pessoa;
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Telefone setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codTelefone=" + codTelefone +
                ", numero=" + numero +
                ", ddd=" + ddd +
                ", pessoa=" + pessoa +
                '}';
    }
}
