package com.uce.edu.demo.matriculacion.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.matriculacion.modelo.Matriculacion;
public interface IMatriculacionRepository {
	public void ingresar(Matriculacion m);
	public void eliminar(Matriculacion m);
	public void actualizar(Matriculacion m);
	public Matriculacion buscar(LocalDateTime fecha);

}
