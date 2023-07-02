package com.generation.gamestore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

	@Entity
	@Table (name = "tb_Produto")
	public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank
		private Long nome;
		
		@NotBlank
		private String tipo;
		
		@NotBlank
		private Long classificacao;
		
		@NotBlank
		private String idioma;
		
		@NotBlank
		private String faixaetaria;
		
		@NotBlank
		private String plataforma;
		
		@ManyToOne
		@JsonIgnoreProperties("produto")
		private Categoria categoria;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getNome() {
			return nome;
		}

		public void setNome(Long preco) {
			this.nome = preco;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public Long getClassificacao() {
			return classificacao;
		}

		public void setClassificacao(Long classificacao) {
			this.classificacao = classificacao;
		}

		public String getIdioma() {
			return idioma;
		}

		public void setIdioma(String idioma) {
			this.idioma = idioma;
		}

		public String getFaixaetaria() {
			return faixaetaria;
		}

		public void setFaixaetaria(String faixaetaria) {
			this.faixaetaria = faixaetaria;
		}

		public String getPlataforma() {
			return plataforma;
		}

		public void setPlataforma(String plataforma) {
			this.plataforma = plataforma;
		}

		public Produto getCategoria() {
			return null;
		}

			
	}

	
		
