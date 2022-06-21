package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.service.IMatriculaVehiculosService;
import com.uce.edu.demo.matriculacion.service.IPropietarioService;
import com.uce.edu.demo.matriculacion.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2AfApplication implements CommandLineRunner{
	
	@Autowired
	private IMatriculaVehiculosService matricular;
	@Autowired
	private IPropietarioService propietario;
	@Autowired
	private IVehiculoService vehiculo;
	
	Scanner leer=new Scanner(System.in);

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2AfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo v=new Vehiculo();
		v.setMarca("Zusuki");
		v.setPlaca("b123");
		v.setPrecio(new BigDecimal(1000));
		v.setTipo("P");
		this.vehiculo.ingresarVehiculo(v);
		
		System.out.println("Cambie los datos de la paca del vehiculo");
		String placa=leer.next();
		v.setPlaca(placa);
		System.out.println("Cambie los datos del precio del vehiculo");
		double precio=leer.nextDouble();
		v.setPrecio(new BigDecimal(precio));
		this.vehiculo.actualizarVehiculo(v);
		
		Propietario p=new Propietario();
		p.setNombre("Axel");
		p.setApellido("Flores");
		p.setCedula("1752310126");
		p.setFechaNacimiento(LocalDateTime.of(2000, 06, 28, 23, 23));
		this.propietario.ingresarPropietario(p);
		
		this.matricular.crearMatricula(p.getCedula(), v.getPlaca());
	}

}
