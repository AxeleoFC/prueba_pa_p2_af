package com.uce.edu.demo.correccion.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
@Component
public class Matricula {
	
	private LocalDateTime fechaMatriculacion;
	private BigDecimal precioMatriculacion;
	private Propietario propietario;
	private Vehiculo vehiculo;
	
	@Override
	public String toString() {
		return "Matriculacion [Fecha de matriculacion=" + fechaMatriculacion + ", Precio de matricula="
				+ precioMatriculacion + ", Propietario=" + propietario + ", Vehiculo=" + vehiculo + "]";
	}
	
	//SET y GET
	public LocalDateTime getFechaMatriculacion() {
		return fechaMatriculacion;
	}
	public void setFechaMatriculacion(LocalDateTime fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}
	public BigDecimal getPrecioMatriculacion() {
		return precioMatriculacion;
	}
	public void setPrecioMatriculacion(BigDecimal precioMatriculacion) {
		this.precioMatriculacion = precioMatriculacion;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
