package com.cibertec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.entity.Curso;
import com.cibertec.service.CursoService;

@Controller
@RequestMapping("/rest/curso")
public class CursoController {
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("/lista")
	public ResponseEntity<?> listaCurso(){
		List<Curso> lstCurso = cursoService.listarCursos();
		return ResponseEntity.ok(lstCurso);
	}
}
