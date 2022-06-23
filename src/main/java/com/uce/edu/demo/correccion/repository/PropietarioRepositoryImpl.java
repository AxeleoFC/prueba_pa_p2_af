package com.uce.edu.demo.correccion.repository;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {
	
	@Override
	public void ingresar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se a ingresado al propietario: "+p+" a la BD.");
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
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se a buscado al propietario con cedula: "+cedula+" en la BD.");
		Propietario p=new Propietario();
		p.setNombre("Axel");
		p.setApellido("Flores");
		p.setCedula("1752310126");
		p.setFechaNacimiento(LocalDateTime.of(2000, 06, 28, 23, 25, 45));
		return p;
		
	}

}
