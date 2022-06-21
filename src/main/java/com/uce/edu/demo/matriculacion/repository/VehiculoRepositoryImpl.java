package com.uce.edu.demo.matriculacion.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {
	
	//Se creo un propietario solo para poder acceder de mejor manera
	//ya que no se guarda en una base de datos
	@Autowired
	private Vehiculo vehiculo;

	@Override
	public void ingresar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se a ingresado al propietario: "+v+" a la BD.");
		this.vehiculo=v;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se a eliminado al vehiculo con placa: "+placa+" de la BD.");
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se a actualizado al vehiculo: "+v+" en la BD.");
		this.vehiculo=v;
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se a buscado al vehiculo con placa: "+placa+" en la BD.");
		return this.vehiculo;
	}

}
