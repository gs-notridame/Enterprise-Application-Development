package br.com.psycheck.domain.entity.pessoa;

import br.com.psycheck.domain.entity.Genero;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class PessoaFisica extends Pessoa {


    @Column(name = "CPF")
    private String cpf;

    @Column(name = "DATA_NASC")
    private LocalDate dataNasc;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "GENERO", referencedColumnName = "COD_GENERO", foreignKey = @ForeignKey(name = "FK_PF_GENERO"))
    private Genero genero;

    public PessoaFisica() {
        super("PF");
    }

    public PessoaFisica(Long codPessoa, String nome, String email, Boolean softDelete, String usuario, String senha, String tipo, LocalDate dataNasc, String cpf, Genero genero) {
        super(codPessoa, nome, email, softDelete, usuario, senha, tipo);
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.genero = genero;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public PessoaFisica setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public PessoaFisica setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public Genero getGenero() {
        return genero;
    }

    public PessoaFisica setGenero(Genero genero) {
        this.genero = genero;
        return this;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "dataNasc=" + dataNasc +
                ", cpf='" + cpf + '\'' +
                ", genero=" + genero +
                "} " + super.toString();
    }
}
