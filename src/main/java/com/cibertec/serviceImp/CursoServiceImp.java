package com.cibertec.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Curso;
import com.cibertec.repository.CursoRepository;
import com.cibertec.service.CursoService;

@Service
public class CursoServiceImp implements CursoService {
	@Autowired
	private CursoRepository repo;

	@Override
	public List<Curso> listarCursos() {
		return repo.findAll();
	}

}
