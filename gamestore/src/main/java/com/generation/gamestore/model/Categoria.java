package com.generation.gamestore.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

	@Entity
	@Table (name = "tb_Categoria")
	public class Categoria {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank
		private String aventura;
		
		@NotBlank
		private String acao;
		
		@NotBlank
		private String puzzle;
		
		@NotBlank
		private String simulador;
		
		@NotBlank
		private String esporte;
		
		@NotBlank
		private String estrategia;
		
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getAventura() {
			return aventura;
		}

		public void setAventura(String aventura) {
			this.aventura = aventura;
		}

		public String getAcao() {
			return acao;
		}

		public void setAcao(String acao) {
			this.acao = acao;
		}

		public String getPuzzle() {
			return puzzle;
		}

		public void setPuzzle(String puzzle) {
			this.puzzle = puzzle;
		}

		public String getSimulador() {
			return simulador;
		}

		public void setSimulador(String simulador) {
			this.simulador = simulador;
		}

		public String getEsporte() {
			return esporte;
		}

		public void setEsporte(String esporte) {
			this.esporte = esporte;
		}

		public String getEstrategia() {
			return estrategia;
		}

		public void setEstrategia(String estrategia) {
			this.estrategia = estrategia;
		}

		
}
