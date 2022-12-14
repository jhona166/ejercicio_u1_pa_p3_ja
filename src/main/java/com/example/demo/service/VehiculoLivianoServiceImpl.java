package com.example.demo.service;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("Liviano")
public class VehiculoLivianoServiceImpl implements IMatriculaService {

	@Override
	public BigDecimal calcular(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal calc = precio.multiply(new BigDecimal(0.10));
		return calc;
	}

}
