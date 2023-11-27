package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "TB_ESTADO")
public class Estado {

   @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST})
   @JoinColumn(
           name = "PAIS",
           referencedColumnName = "COD_PAIS",
           foreignKey = @ForeignKey(name = "FK_ESTADO_PAIS")
   )
   private Pais pais;

   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESTADO")
   @SequenceGenerator(name = "SQ_ESTADO", sequenceName = "SQ_ESTADO", allocationSize = 1, initialValue = 1)
   @Column(name = "COD_ESTADO")
   private Long codEstado;
   @Column(name = "NOME")
   private  String nome;

   public Estado() {
   }

   public Estado(Long codEstado, String nome) {
      this.codEstado = codEstado;
      this.nome = nome;
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

   @Override
   public String toString() {
      return "Estado{" +
              "codEstado=" + codEstado +
              ", nome='" + nome + '\'' +
              '}';
   }
}
