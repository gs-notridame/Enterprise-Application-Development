package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "TB_GENERO")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_GENERO")
    @SequenceGenerator(name = "SQ_GENERO", sequenceName = "SQ_GENERO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_GENERO")
    private BigDecimal codGenero;
    @Column(name = "GENERO")
    private  String genero;

    public Genero() {
    }

    public Genero(BigDecimal codGenero, String genero) {
        this.codGenero = codGenero;
        this.genero = genero;
    }

    public BigDecimal getCodGenero() {
        return codGenero;
    }

    public Genero setCodGenero(BigDecimal codGenero) {
        this.codGenero = codGenero;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public Genero setGenero(String genero) {
        this.genero = genero;
        return this;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "codGenero=" + codGenero +
                ", genero='" + genero + '\'' +
                '}';
    }
}
