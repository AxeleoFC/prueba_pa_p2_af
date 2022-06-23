package com.uce.edu.demo.correccion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("pesado")
public class MatriculaPesadoServiceImpl implements IMatriculaService {

	@Override
	public BigDecimal calcula(BigDecimal cantidad) {
		// TODO Auto-generated method stub
		return cantidad.multiply(new BigDecimal(0.15));
	}


}
