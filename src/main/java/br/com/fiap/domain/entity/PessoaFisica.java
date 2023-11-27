package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TB_PF", uniqueConstraints = {
        @UniqueConstraint( name = "UK_PF_CPF", columnNames = "CPF")
})
@DiscriminatorValue("PF")
public class PessoaFisica extends Pessoa {

    @Column(name = "DATA_NASC")
    private Date dataNasc;
    @Column(name = "CPF")
    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(Long codPessoa, String nome, String email, Boolean softDelete, String usuario, String senha, Long codPf, Date dataNasc, String cpf) {
        super(codPessoa, nome, email, softDelete, usuario, senha);
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public PessoaFisica setDataNasc(Date dataNasc) {
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

    @Override
    public String toString() {
        return "PessoaFisica{" +
                ", dataNasc=" + dataNasc +
                ", cpf='" + cpf + '\'' +
                "} " + super.toString();
    }
}
