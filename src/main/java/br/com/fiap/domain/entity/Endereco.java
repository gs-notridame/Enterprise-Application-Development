package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_ENDERECO")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @SequenceGenerator(name = "SQ_ENDERECO", sequenceName = "SQ_ENDERECO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_ENDERECO")
    private BigDecimal codEndereco;
    @Column(name = "CEP")
    private  BigDecimal cep;
    @Column(name = "LOGRADOURO")
    private  String logradouoro;
    @Column(name = "NUMERO")
    private BigDecimal numero;
    @Column(name = "COMPLEMENTO")
    private  BigDecimal complemento;

    public Endereco() {
    }

    public Endereco(BigDecimal codEndereco, BigDecimal cep, String logradouoro, BigDecimal numero, BigDecimal complemento) {
        this.codEndereco = codEndereco;
        this.cep = cep;
        this.logradouoro = logradouoro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public BigDecimal getCodEndereco() {
        return codEndereco;
    }

    public Endereco setCodEndereco(BigDecimal codEndereco) {
        this.codEndereco = codEndereco;
        return this;
    }

    public BigDecimal getCep() {
        return cep;
    }

    public Endereco setCep(BigDecimal cep) {
        this.cep = cep;
        return this;
    }

    public String getLogradouoro() {
        return logradouoro;
    }

    public Endereco setLogradouoro(String logradouoro) {
        this.logradouoro = logradouoro;
        return this;
    }

    public BigDecimal getNumero() {
        return numero;
    }

    public Endereco setNumero(BigDecimal numero) {
        this.numero = numero;
        return this;
    }

    public BigDecimal getComplemento() {
        return complemento;
    }

    public Endereco setComplemento(BigDecimal complemento) {
        this.complemento = complemento;
        return this;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "codEndereco=" + codEndereco +
                ", cep=" + cep +
                ", logradouoro='" + logradouoro + '\'' +
                ", numero=" + numero +
                ", complemento=" + complemento +
                '}';
    }
}