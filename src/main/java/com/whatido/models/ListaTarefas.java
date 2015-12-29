package com.whatido.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class ListaTarefas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	private String descricao;
	
	@OneToMany(mappedBy="lista", cascade=CascadeType.ALL, orphanRemoval=true)
	private List<Tarefas> tarefas;
	
	//getters e setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setTarefas(List<Tarefas> tarefas) {
		this.tarefas = tarefas;
	}
	public List<Tarefas> getTarefas() {
		return tarefas;
	}
	
	@Override
	public String toString() {
		return "ListaTarefas [id=" + id + ", descricao=" + descricao + "]";
	}

}
