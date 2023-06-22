package com.cibertec.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "curso")
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
	@Id
	@Column(name = "idCurso")
	private int idCurso;

	@Column(name = "nombre")
	private String nombre;
}
