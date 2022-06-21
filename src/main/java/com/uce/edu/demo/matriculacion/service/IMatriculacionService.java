package com.uce.edu.demo.matriculacion.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.matriculacion.modelo.Matriculacion;

public interface IMatriculacionService {
	public void ingresarMatricula(Matriculacion m);
	public void eliminarMatricula(Matriculacion m);
	public void actualizarMatricula(Matriculacion m);
	public Matriculacion buscarMatricula(LocalDateTime fecha);

}
