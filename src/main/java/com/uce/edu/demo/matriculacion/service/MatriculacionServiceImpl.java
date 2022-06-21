package com.uce.edu.demo.matriculacion.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Matriculacion;
import com.uce.edu.demo.matriculacion.repository.IMatriculacionRepository;
@Service
public class MatriculacionServiceImpl implements IMatriculacionService {
	@Autowired
	private IMatriculacionRepository matricualRepo;
	@Override
	public void ingresarMatricula(Matriculacion m) {
		// TODO Auto-generated method stub
		this.matricualRepo.ingresar(m);
	}

	@Override
	public void eliminarMatricula(Matriculacion m) {
		// TODO Auto-generated method stub
		this.matricualRepo.eliminar(m);
	}

	@Override
	public void actualizarMatricula(Matriculacion m) {
		// TODO Auto-generated method stub
		this.matricualRepo.actualizar(m);
	}

	@Override
	public Matriculacion buscarMatricula(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.matricualRepo.buscar(fecha);
	}

}
