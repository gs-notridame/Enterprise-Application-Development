package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "TB_BAIRRO")
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BAIRRO")
    @SequenceGenerator(name = "SQ_BAIRRO", sequenceName = "SQ_BAIRRO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_BAIRRO")
    private BigDecimal codBairro;
    @Column(name = "NOME")
    private  String nome;
    @Column(name = "COD_IBGE")
    private BigDecimal codIbge;

    public Bairro() {
    }

    public Bairro(BigDecimal codBairro, String nome, BigDecimal codIbge) {
        this.codBairro = codBairro;
        this.nome = nome;
        this.codIbge = codIbge;
    }

    public BigDecimal getCodBairro() {
        return codBairro;
    }

    public Bairro setCodBairro(BigDecimal codBairro) {
        this.codBairro = codBairro;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Bairro setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public BigDecimal getCodIbge() {
        return codIbge;
    }

    public Bairro setCodIbge(BigDecimal codIbge) {
        this.codIbge = codIbge;
        return this;
    }

    @Override
    public String toString() {
        return "Bairro{" +
                "codBairro=" + codBairro +
                ", nome='" + nome + '\'' +
                ", codIbge=" + codIbge +
                '}';
    }
}