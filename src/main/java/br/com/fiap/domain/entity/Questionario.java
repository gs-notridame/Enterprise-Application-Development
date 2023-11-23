package br.com.fiap.domain.entity;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "TB_QUESTIONARIO")
public class Questionario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_QUESTIONARIO")
    @SequenceGenerator(name = "SQ_QUESTIONARIO", sequenceName = "SQ_QUESTIONARIO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_QUESTIONARIO")
    private BigDecimal codQuestionario;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "PERGUNTAS")
    private String perguntas;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "CATEGORIA")
    private String categoria;
    @Column(name = "NOME_CRIADOR")
    private String nomeCriador;
    @Column(name = "DURACAO")
    private Date duracao;

    public Questionario() {
    }

    public Questionario(BigDecimal codQuestionario, String descricao, String perguntas, String titulo, String categoria, String nomeCriador, Date duracao) {
        this.codQuestionario = codQuestionario;
        this.descricao = descricao;
        this.perguntas = perguntas;
        this.titulo = titulo;
        this.categoria = categoria;
        this.nomeCriador = nomeCriador;
        this.duracao = duracao;
    }

    public BigDecimal getCodQuestionario() {
        return codQuestionario;
    }

    public Questionario setCodQuestionario(BigDecimal codQuestionario) {
        this.codQuestionario = codQuestionario;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Questionario setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public String getPerguntas() {
        return perguntas;
    }

    public Questionario setPerguntas(String perguntas) {
        this.perguntas = perguntas;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }

    public Questionario setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getCategoria() {
        return categoria;
    }

    public Questionario setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public String getNomeCriador() {
        return nomeCriador;
    }

    public Questionario setNomeCriador(String nomeCriador) {
        this.nomeCriador = nomeCriador;
        return this;
    }

    public Date getDuracao() {
        return duracao;
    }

    public Questionario setDuracao(Date duracao) {
        this.duracao = duracao;
        return this;
    }

    @Override
    public String toString() {
        return "Questionario{" +
                "codQuestionario=" + codQuestionario +
                ", descricao='" + descricao + '\'' +
                ", perguntas='" + perguntas + '\'' +
                ", titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", nomeCriador='" + nomeCriador + '\'' +
                ", duracao=" + duracao +
                '}';
    }
}
