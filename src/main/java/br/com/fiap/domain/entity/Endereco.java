package br.com.fiap.domain.entity;

import br.com.fiap.infra.security.entity.Pessoa;
import jakarta.persistence.*;

//https://github.com/google/gson/issues/2485
@Entity
@Table(name = "TB_ENDERECO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_END_PESSOA", columnNames = {"PESSOA", "CEP"})
})
public class Endereco {

    @Id
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "PESSOA",
            referencedColumnName = "ID_PESSOA",
            foreignKey = @ForeignKey(name = "FK_ENDERECO_PESSOA")
    )
    private Pessoa pessoa;

    //    @Id
    @Column(name = "CEP")
    private String cep;

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String localidade;

    private String uf;

    private String ibge;

    private String gia;

    private String ddd;

    private String siafi;


    public Endereco() {
    }


    public Endereco(Pessoa pessoa, String cep, String logradouro, String numero, String complemento, String bairro, String localidade, String uf, String ibge, String gia, String ddd, String siafi) {
        this.pessoa = pessoa;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    public String getNumero() {
        return numero;
    }

    public Endereco setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String getComplemento() {
        return complemento;
    }

    public Endereco setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Endereco setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }


    @Override
    public String toString() {
        return "Endereco{" +
                "pessoa=" + pessoa +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                ", ibge='" + ibge + '\'' +
                ", gia='" + gia + '\'' +
                ", ddd='" + ddd + '\'' +
                ", siafi='" + siafi + '\'' +
                '}';
    }
}
