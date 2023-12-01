package br.com.psycheck.domain.entity;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name = "QUESTIONARIO")
public class Questionario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_QUESTIONARIO")
    @SequenceGenerator(name = "SQ_QUESTIONARIO", sequenceName = "SQ_QUESTIONARIO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_QUESTIONARIO")
    private Long codQuestionario;
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
    private LocalDate duracao;

    public Questionario() {
    }

    public Questionario(Long codQuestionario, String descricao, String perguntas, String titulo, String categoria, String nomeCriador, LocalDate duracao) {
        this.codQuestionario = codQuestionario;
        this.descricao = descricao;
        this.perguntas = perguntas;
        this.titulo = titulo;
        this.categoria = categoria;
        this.nomeCriador = nomeCriador;
        this.duracao = duracao;
    }

    public Long getCodQuestionario() {
        return codQuestionario;
    }

    public Questionario setCodQuestionario(Long codQuestionario) {
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

    public LocalDate getDuracao() {
        return duracao;
    }

    public Questionario setDuracao(LocalDate duracao) {
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
