package com.uce.edu.demo.correccion.repository;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uce.edu.demo.correccion.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {
	
	@Override
	public void ingresar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se a ingresado al propietario: "+v+" a la BD.");
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
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se a buscado al vehiculo con placa: "+placa+" en la BD.");
		Vehiculo vehi=new Vehiculo();
		vehi.setMarca("Toyota");
		vehi.setPlaca("PCT8673");
		vehi.setPrecio(new BigDecimal(1200));
		vehi.setTipo("L");
		return vehi;
	}

}
