package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.math.BigDecimal;
@Entity
@Table(name = "TB_PF", uniqueConstraints = {
        @UniqueConstraint( name = "UK_PF_CPF", columnNames = "NR_CPF")
})
@DiscriminatorValue("PF")
public class pessoaFisica extends Pessoa {
    @Column(name = "DATA_NASC")
    private Date dataNasc;
    @Column(name = "CPF")
    private BigDecimal cpf;

    public pessoaFisica() {
    }

    public pessoaFisica(BigDecimal codPessoa, String nome, String email,
                        Boolean softDelete, String usuario, String senha, Date dataNasc, BigDecimal cpf) {
        super(codPessoa, nome, email, softDelete, usuario, senha);
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public pessoaFisica setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
        return this;
    }

    public BigDecimal getCpf() {
        return cpf;
    }

    public pessoaFisica setCpf(BigDecimal cpf) {
        this.cpf = cpf;
        return this;
    }

    @Override
    public String toString() {
        return "pessoaFisica{" +
                "dataNasc=" + dataNasc +
                ", cpf=" + cpf +
                "} " + super.toString();
    }
}
