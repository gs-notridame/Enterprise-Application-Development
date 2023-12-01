package br.com.psycheck.domain.entity.endereco;

import jakarta.persistence.*;

@Entity
@Table(name = "ESTADO")
public class Estado {

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESTADO")
   @SequenceGenerator(name = "SQ_ESTADO", sequenceName = "SQ_ESTADO", allocationSize = 1, initialValue = 1)
   @Column(name = "COD_ESTADO")
   private Long codEstado;
   @Column(name = "NOME")
   private  String nome;

   @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
   @JoinColumn(
           name = "PAIS",
           referencedColumnName = "COD_PAIS",
           foreignKey = @ForeignKey(name = "FK_ESTADO_PAIS")
   )
   private Pais pais;

   public Estado() {
   }

   public Estado(Long codEstado, String nome, Pais pais) {
      this.codEstado = codEstado;
      this.nome = nome;
      this.pais = pais;
   }

   public Long getCodEstado() {
      return codEstado;
   }

   public Estado setCodEstado(Long codEstado) {
      this.codEstado = codEstado;
      return this;
   }

   public String getNome() {
      return nome;
   }

   public Estado setNome(String nome) {
      this.nome = nome;
      return this;
   }

   public Pais getPais() {
      return pais;
   }

   public Estado setPais(Pais pais) {
      this.pais = pais;
      return this;
   }

   @Override
   public String toString() {
      return "Estado{" +
              "codEstado=" + codEstado +
              ", nome='" + nome + '\'' +
              ", pais=" + pais +
              '}';
   }
}
