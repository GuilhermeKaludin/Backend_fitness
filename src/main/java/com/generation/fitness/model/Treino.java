package com.generation.fitness.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table (name = "tb_treino")
public class Treino {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull (message = "O atributo Aparelho é obrigatório!")	
	private String aparelho;
	
	@NotNull (message = "O atributo Descrição é obrigatório!")	
	private String descricao;
	
	@NotNull (message = "O atributo Exercício é obrigatório!")	
	private String exercicio;
	
	private Long serie;
	
	private Long repeticao;
	
	@ManyToOne
	@JsonIgnoreProperties ("treino")
	private Usuario usuario;
	
	@ManyToOne
	@JsonIgnoreProperties ("treino")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAparelho() {
		return aparelho;
	}

	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getExercicio() {
		return exercicio;
	}

	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}

	public Long getSerie() {
		return serie;
	}

	public void setSerie(Long serie) {
		this.serie = serie;
	}

	public Long getRepeticao() {
		return repeticao;
	}

	public void setRepeticao(Long repeticao) {
		this.repeticao = repeticao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
