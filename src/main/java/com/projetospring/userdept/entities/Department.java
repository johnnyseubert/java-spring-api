package com.projetospring.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //diz que vai ser uma entidade do banco de dados
@Table(name = "tb_department") // nome da tabela que eu quero
public class Department {
	
	@Id //diz que vai ser um Id unico
	@GeneratedValue(strategy = GenerationType.IDENTITY) // gera o valor de forma automatica
	private Long id;
	private String name;
	
	public Department() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}