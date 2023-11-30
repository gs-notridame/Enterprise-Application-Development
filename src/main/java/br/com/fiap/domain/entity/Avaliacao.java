package br.com.fiap.domain.entity;
import br.com.fiap.domain.entity.pessoa.Medico;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "AVALIACAO")
public class Avaliacao {

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "MEDICO",
            referencedColumnName = "COD_MEDICO",
            foreignKey = @ForeignKey(name = "FK_AVALIACAO_MEDICO")
    )
    private Medico medico;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_AVALIACAO")
    @SequenceGenerator(name = "SQ_AVALIACAO", sequenceName = "SQ_AVALIACAO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_AVALIACAO")
    private Long codAvaliacao;
    @Column(name = "NOTA")
    private Long nota;
    @Column(name = "COMENTARIO")
    private String comentario;
    @Column(name = "DATA")
    private LocalDate data;

    public Avaliacao() {
    }

    public Avaliacao(Long codAvaliacao, Long nota, String comentario, LocalDate data) {
        this.codAvaliacao = codAvaliacao;
        this.nota = nota;
        this.comentario = comentario;
        this.data = data;
    }

    public Long getCodAvaliacao() {
        return codAvaliacao;
    }

    public Avaliacao setCodAvaliacao(Long codAvaliacao) {
        this.codAvaliacao = codAvaliacao;
        return this;
    }

    public Long getNota() {
        return nota;
    }

    public Avaliacao setNota(Long nota) {
        this.nota = nota;
        return this;
    }

    public String getComentario() {
        return comentario;
    }

    public Avaliacao setComentario(String comentario) {
        this.comentario = comentario;
        return this;
    }

    public LocalDate getData() {
        return data;
    }

    public Avaliacao setData(LocalDate data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "codAvaliacao=" + codAvaliacao +
                ", nota=" + nota +
                ", comentario='" + comentario + '\'' +
                ", data=" + data +
                '}';
    }
}
