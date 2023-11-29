package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "TRIAGEM")
public class Triagem {

    @OneToOne
    @JoinColumn(name = "COD_QUESTIONARIO", referencedColumnName = "COD_QUESTIONARIO")
    private Questionario questionario;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "PACIENTE",
            referencedColumnName = "COD_PACIENTE",
            foreignKey = @ForeignKey(name = "FK_TRIAGEM_PACIENTE")
    )
    private Paciente paciente;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TRIAGEM")
    @SequenceGenerator(name = "SQ_TRIAGEM", sequenceName = "SQ_TRIAGEM", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_TRIAGEM")
    private Long codTriagem;
    @Column(name = "INICIO")
    private LocalDate incio;
    @Column(name = "FIM")
    private LocalDate fim;
    @Column(name = "DURACAO")
    private Time duracao;
    @Column(name = "RESPOSTAS")
    private String respostas;

    public Triagem() {
    }

    public Triagem(Long codTriagem, LocalDate incio, LocalDate fim, Time duracao, String respostas) {
        this.codTriagem = codTriagem;
        this.incio = incio;
        this.fim = fim;
        this.duracao = duracao;
        this.respostas = respostas;
    }

    public Long getCodTriagem() {
        return codTriagem;
    }

    public Triagem setCodTriagem(Long codTriagem) {
        this.codTriagem = codTriagem;
        return this;
    }

    public LocalDate getIncio() {
        return incio;
    }

    public Triagem setIncio(LocalDate incio) {
        this.incio = incio;
        return this;
    }

    public LocalDate getFim() {
        return fim;
    }

    public Triagem setFim(LocalDate fim) {
        this.fim = fim;
        return this;
    }

    public Time getDuracao() {
        return duracao;
    }

    public Triagem setDuracao(Time duracao) {
        this.duracao = duracao;
        return this;
    }

    public String getRespostas() {
        return respostas;
    }

    public Triagem setRespostas(String respostas) {
        this.respostas = respostas;
        return this;
    }

    @Override
    public String toString() {
        return "Triagem{" +
                "codTriagem=" + codTriagem +
                ", incio=" + incio +
                ", fim=" + fim +
                ", duracao=" + duracao +
                ", respostas='" + respostas + '\'' +
                '}';
    }
}
