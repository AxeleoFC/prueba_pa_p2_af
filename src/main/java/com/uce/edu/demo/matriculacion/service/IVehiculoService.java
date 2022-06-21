package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoService {
	public void ingresarVehiculo(Vehiculo v);
	public void eliminarVehiculo(String placa);
	public void actualizarVehiculo(Vehiculo v);
	public Vehiculo buscarVehiculo(String placa);
}
