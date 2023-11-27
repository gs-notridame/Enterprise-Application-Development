package br.com.fiap.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_PAIS")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PAIS")
    @SequenceGenerator(name = "SQ_PAIS", sequenceName = "SQ_PAIS", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PAIS")
    private Long codPais;
    @Column(name = "NOME")
    private String nome;

    public Pais() {
    }

    public Pais(Long codPais, String nome) {
        this.codPais = codPais;
        this.nome = nome;
    }

    public float getCodPais() {
        return codPais;
    }

    public Pais setCodPais(Long codPais) {
        this.codPais = codPais;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pais setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "codPais=" + codPais +
                ", nome='" + nome + '\'' +
                '}';
    }
}
