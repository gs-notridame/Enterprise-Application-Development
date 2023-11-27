package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.math.BigDecimal;
@Entity
@Table(name = "TB_PF", uniqueConstraints = {
        @UniqueConstraint( name = "UK_PF_CPF", columnNames = "NR_CPF")
})
@DiscriminatorValue("PF")
public class PessoaFisica extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PF")
    @SequenceGenerator(name = "SQ_PF", sequenceName = "SQ_PF", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_PF")
    private Long codPf;
    @Column(name = "DATA_NASC")
    private Date dataNasc;
    @Column(name = "CPF")
    private BigDecimal cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(BigDecimal codPessoa, String nome, String email, Boolean softDelete, String usuario, String senha, Long codPf, Date dataNasc, BigDecimal cpf) {
        super(codPessoa, nome, email, softDelete, usuario, senha);
        this.codPf = codPf;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }

    public Long getCodPf() {
        return codPf;
    }

    public PessoaFisica setCodPf(Long codPf) {
        this.codPf = codPf;
        return this;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public PessoaFisica setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
        return this;
    }

    public BigDecimal getCpf() {
        return cpf;
    }

    public PessoaFisica setCpf(BigDecimal cpf) {
        this.cpf = cpf;
        return this;
    }

    @Override
    public String toString() {
        return "pessoaFisica{" +
                "codPf=" + codPf +
                ", dataNasc=" + dataNasc +
                ", cpf=" + cpf +
                "} " + super.toString();
    }
}
