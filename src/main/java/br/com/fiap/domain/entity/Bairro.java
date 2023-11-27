package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "TB_BAIRRO")
public class Bairro {

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "ENDERECO",
            referencedColumnName = "COD_ENDERECO",
            foreignKey = @ForeignKey(name = "FK_BAIRRO_ENDERECP")
    )
    private Endereco endereco;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "CIDADE",
            referencedColumnName = "COD_CIDADE",
            foreignKey = @ForeignKey(name = "FK_BAIRRO_CIDADE")
    )
    private Cidade cidade;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BAIRRO")
    @SequenceGenerator(name = "SQ_BAIRRO", sequenceName = "SQ_BAIRRO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_BAIRRO")
    private Long codBairro;
    @Column(name = "NOME")
    private  String nome;

    public Bairro() {
    }

    public Bairro(Long codBairro, String nome) {
        this.codBairro = codBairro;
        this.nome = nome;

    }
    public Long getCodBairro() {
        return codBairro;
    }

    public Bairro setCodBairro(Long codBairro) {
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

    @Override
    public String toString() {
        return "Bairro{" +
                "codBairro=" + codBairro +
                ", nome='" + nome + '\'' +
                '}';
    }
}