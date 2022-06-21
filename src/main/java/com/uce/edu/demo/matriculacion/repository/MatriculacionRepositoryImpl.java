package com.uce.edu.demo.matriculacion.repository;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Matriculacion;

@Repository
public class MatriculacionRepositoryImpl implements IMatriculacionRepository{
	
	//Se creo un propietario solo para poder acceder de mejor manera
	//ya que no se guarda en una base de datos
	@Autowired
	private Matriculacion matriculacion;

	@Override
	public void ingresar(Matriculacion m) {
		// TODO Auto-generated method stub
		System.out.println("Se a ingresado la matricula: "+m+" a la BD.");
		this.matriculacion=m;
	}

	@Override
	public void eliminar(Matriculacion m) {
		// TODO Auto-generated method stub
		System.out.println("Se a eliminado la matricula: "+m+" de la BD.");
	}

	@Override
	public void actualizar(Matriculacion m) {
		// TODO Auto-generated method stub
		System.out.println("Se a actualizado la matricula: "+m+" en la BD.");
		this.matriculacion=m;
	}

	@Override
	public Matriculacion buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se a buscado al matricula del dia: "+fecha+" en la BD.");
		return this.matriculacion;
	}
}

