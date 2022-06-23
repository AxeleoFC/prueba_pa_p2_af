package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.correccion.modelo.Propietario;
import com.uce.edu.demo.correccion.modelo.Vehiculo;
import com.uce.edu.demo.correccion.service.IMatriculaGestorService;
import com.uce.edu.demo.correccion.service.IPropietarioService;
import com.uce.edu.demo.correccion.service.IVehiculoService;


@SpringBootApplication
public class PruebaPaP2AfApplication implements CommandLineRunner{
	
	@Autowired
	private IMatriculaGestorService matriculaService;
	@Autowired
	private IPropietarioService propietarioService;
	@Autowired
	private IVehiculoService vehiculoService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setMarca("Totota");
		vehiculo.setPlaca("PCT8673");
		vehiculo.setPrecio(new BigDecimal(5000));
		vehiculo.setTipo("P");
		this.vehiculoService.ingresarVehiculo(vehiculo);
		
		//2
		vehiculo.setMarca("Toyota");
		vehiculo.setPrecio(new BigDecimal(10000));
		this.vehiculoService.actualizarVehiculo(vehiculo);
		
		//3
		Propietario p=new Propietario();
		p.setNombre("Axel");
		p.setApellido("Flores");
		p.setCedula("1752310126");
		p.setFechaNacimiento(LocalDateTime.of(2000, 06, 28, 23, 23));
		this.propietarioService.ingresarPropietario(p);
		
		//4
		this.matriculaService.crearMatricula(p.getCedula(), vehiculo.getPlaca());
	}

}
