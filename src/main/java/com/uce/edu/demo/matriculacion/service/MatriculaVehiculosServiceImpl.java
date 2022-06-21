package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Matriculacion;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
@Service
public class MatriculaVehiculosServiceImpl implements IMatriculaVehiculosService {
	
	@Autowired
	private IMatriculacionService matriculaService;
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;

	@Override
	public void crearMatricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matriculacion m=new Matriculacion();
		m.setFechaMatriculacion(LocalDateTime.now());
		m.setVehiculo(this.vehiculoService.buscarVehiculo(placa));
		m.setPropietario(this.propietarioService.buscarPropietario(cedula));
		m.setPrecioMatriculacion(this.calcularPrecio(this.vehiculoService.buscarVehiculo(placa)));
		this.matriculaService.ingresarMatricula(m);
		System.out.println("Se a generado la matricula");
		System.out.println(m);

	}
	
	public BigDecimal calcularPrecio(Vehiculo vehiculo) {
		BigDecimal valorM=null;
		if(vehiculo.getTipo().equals("P")) {
			valorM=vehiculo.getPrecio().multiply(new BigDecimal(0.15).setScale(2, RoundingMode.HALF_UP));
		}else if(vehiculo.getTipo().equals("L")) {
			valorM=vehiculo.getPrecio().multiply(new BigDecimal(0.10).setScale(2, RoundingMode.HALF_UP));
		}
		
		if(vehiculo.getPrecio().doubleValue()>2000) {
			valorM=valorM.subtract(valorM.multiply(new BigDecimal(0.07).setScale(2, RoundingMode.HALF_UP)));
		}
		
		return valorM;
	}

}
