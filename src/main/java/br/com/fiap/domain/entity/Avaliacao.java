package br.com.fiap.domain.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "TB_AVALIACAO")
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_AGENDAMENTO")
    @SequenceGenerator(name = "SQ_AGENDAMENTO", sequenceName = "AGENDAMENTO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_AVALIACAO")
    private BigDecimal codAvaliacao;
    @Column(name = "NOTA")
    private BigDecimal nota;
    @Column(name = "COMENTARIO")
    private String comentario;
    @Column(name = "DATA")
    private Date data;

    public Avaliacao() {
    }

    public Avaliacao(BigDecimal codAvaliacao, BigDecimal nota, String comentario, Date data) {
        this.codAvaliacao = codAvaliacao;
        this.nota = nota;
        this.comentario = comentario;
        this.data = data;
    }

    public BigDecimal getCodAvaliacao() {
        return codAvaliacao;
    }

    public Avaliacao setCodAvaliacao(BigDecimal codAvaliacao) {
        this.codAvaliacao = codAvaliacao;
        return this;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public Avaliacao setNota(BigDecimal nota) {
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

    public Date getData() {
        return data;
    }

    public Avaliacao setData(Date data) {
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
