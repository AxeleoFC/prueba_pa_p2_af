package com.uce.edu.demo.matriculacion.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {
	
	//Se creo un propietario solo para poder acceder de mejor manera
	//ya que no se guarda en una base de datos
	@Autowired
	private Propietario propietario;
	
	@Override
	public void ingresar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se a ingresado al propietario: "+p+" a la BD.");
		this.propietario=p;
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se a eliminado al propietario con cedula: "+cedula+" de la BD.");
	}

	@Override
	public void actualizar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se a actualizado al propietario: "+p+" en la BD.");
		this.propietario=p;
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se a buscado al propietario con cedula: "+cedula+" en la BD.");
		return this.propietario;
		
	}

}
