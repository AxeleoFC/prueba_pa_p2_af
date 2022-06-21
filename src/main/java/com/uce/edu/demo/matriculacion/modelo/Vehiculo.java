package com.uce.edu.demo.matriculacion.modelo;

import java.math.BigDecimal;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Se le dio un Scope de singleton para un mejor acceso a los atos en memoria
//ya que no se accede a la base de datos
@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Vehiculo {
	private String marca;
	private String placa;
	private String tipo;
	private BigDecimal precio;
	
	@Override
	public String toString() {
		return "Vehiculo [Marca=" + marca + ", Placa=" + placa + ", Tipo=" + tipo + ", Precio=" + precio + "]";
	}
	
	//SET y GET
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}
