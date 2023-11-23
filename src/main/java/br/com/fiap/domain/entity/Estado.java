package br.com.fiap.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
@Table(name = "TB_ESTADO")
public class Estado {
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESTADO")
   @SequenceGenerator(name = "SQ_ESTADO", sequenceName = "SQ_ESTADO", allocationSize = 1, initialValue = 1)
   @Column(name = "COD_BAIRRO")
   private BigDecimal codEstado;
   @Column(name = "NOME")
   private  String nome;

   public Estado() {
   }

   public Estado(BigDecimal codEstado, String nome) {
      this.codEstado = codEstado;
      this.nome = nome;
   }

   public BigDecimal getCodEstado() {
      return codEstado;
   }

   public Estado setCodEstado(BigDecimal codEstado) {
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
