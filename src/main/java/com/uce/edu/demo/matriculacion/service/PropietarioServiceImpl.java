package com.uce.edu.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.repository.IPropietarioRepository;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
	@Autowired
	private IPropietarioRepository propietarioRepo;

	@Override
	public void ingresarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.propietarioRepo.ingresar(p);
	}

	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		this.propietarioRepo.eliminar(cedula);
	}

	@Override
	public void actualizarPropietario(Propietario p) {
		// TODO Auto-generated method stub
		this.propietarioRepo.actualizar(p);
	}

	@Override
	public Propietario buscarPropietario(String cedula) {
		// TODO Auto-generated method stub
		return this.propietarioRepo.buscar(cedula);
	}

}
