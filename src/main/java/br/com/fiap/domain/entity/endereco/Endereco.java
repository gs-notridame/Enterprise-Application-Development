package br.com.fiap.domain.entity.endereco;

import br.com.fiap.domain.entity.pessoa.Pessoa;
import jakarta.persistence.*;

@Entity
@Table(name = "ENDERECO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ENDERECO")
    @SequenceGenerator(name = "SQ_ENDERECO", sequenceName = "SQ_ENDERECO", allocationSize = 1, initialValue = 1)
    @Column(name = "COD_ENDERECO")
    private Long codEndereco;
    @Column(name = "CEP")
    private  Long cep;
    @Column(name = "LOGRADOURO")
    private  String logradouoro;
    @Column(name = "NUMERO")
    private Long numero;
    @Column(name = "COMPLEMENTO")
    private  String complemento;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "PESSOA",
            referencedColumnName = "COD_PESSOA",
            foreignKey = @ForeignKey(name = "FK_ENDERECO_PESSOA")
    )
    private Pessoa pessoa;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
    @JoinColumn(
            name = "BAIRRO",
            referencedColumnName = "COD_BAIRRO",
            foreignKey = @ForeignKey(name = "FK_ENDERECO_BAIRRO")
    )
    private Bairro bairro;

    public Endereco() {
    }

    public Endereco(Long codEndereco, Long cep, String logradouoro, Long numero, String complemento, Pessoa pessoa, Bairro bairro) {
        this.codEndereco = codEndereco;
        this.cep = cep;
        this.logradouoro = logradouoro;
        this.numero = numero;
        this.complemento = complemento;
        this.pessoa = pessoa;
        this.bairro = bairro;
    }

    public Long getCodEndereco() {
        return codEndereco;
    }

    public Endereco setCodEndereco(Long codEndereco) {
        this.codEndereco = codEndereco;
        return this;
    }

    public Long getCep() {
        return cep;
    }

    public Endereco setCep(Long cep) {
        this.cep = cep;
        return this;
    }

    public String getLogradouoro() {
        return logradouoro;
    }

    public Endereco setLogradouoro(String logradouoro) {
        this.logradouoro = logradouoro;
        return this;
    }

    public Long getNumero() {
        return numero;
    }

    public Endereco setNumero(Long numero) {
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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Endereco setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public Endereco setBairro(Bairro bairro) {
        this.bairro = bairro;
        return this;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "codEndereco=" + codEndereco +
                ", cep=" + cep +
                ", logradouoro='" + logradouoro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", pessoa=" + pessoa +
                ", bairro=" + bairro +
                '}';
    }
}
