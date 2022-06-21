package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {
	public void ingresar(Propietario p);
	public void eliminar(String cedula);
	public void actualizar(Propietario p);
	public Propietario buscar(String cedula);

}
