package br.com.psycheck.domain.entity.pessoa;

import jakarta.persistence.*;

@Entity
@Table(name = "PESSOA")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PESSOA")
    @SequenceGenerator(name = "SQ_PESSOA", sequenceName = "SQ_PESSOA", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PESSOA")
    private Long codPessoa;

    @Column(name = "NOME")
    private String nome;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "SOFT_DELETE")
    private Boolean softDelete;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "SENHA")
    private String senha;

    @Column(name = "TIPO")
    private String tipo;

    public Pessoa() {
    }

    public Pessoa(String tipo) {
        this.tipo = tipo;
    }

    public Pessoa(Long codPessoa, String nome, String email, Boolean softDelete, String usuario, String senha, String tipo) {
        this.codPessoa = codPessoa;
        this.nome = nome;
        this.email = email;
        this.softDelete = softDelete;
        this.usuario = usuario;
        this.senha = senha;
        this.tipo = tipo;
    }

    public Long getCodPessoa() {
        return codPessoa;
    }

    public Pessoa setCodPessoa(Long codPessoa) {
        this.codPessoa = codPessoa;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Pessoa setEmail(String email) {
        this.email = email;
        return this;
    }

    public Boolean getSoftDelete() {
        return softDelete;
    }

    public Pessoa setSoftDelete(Boolean softDelete) {
        this.softDelete = softDelete;
        return this;
    }

    public String getUsuario() {
        return usuario;
    }

    public Pessoa setUsuario(String usuario) {
        this.usuario = usuario;
        return this;
    }

    public String getSenha() {
        return senha;
    }

    public Pessoa setSenha(String senha) {
        this.senha = senha;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public Pessoa setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codPessoa=" + codPessoa +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", softDelete=" + softDelete +
                ", usuario='" + usuario + '\'' +
                ", senha='" + senha + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
