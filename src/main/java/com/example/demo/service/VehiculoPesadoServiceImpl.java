package com.example.demo.service;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Pesado")
public class VehiculoPesadoServiceImpl implements IMatriculaService {
	
	@Override
	public BigDecimal calcular(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal calc = precio.multiply(new BigDecimal(0.15));
		return calc;
	}

}
