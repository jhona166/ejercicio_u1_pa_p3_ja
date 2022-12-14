package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matricula;
import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.IVehiculoRepository;

@Service

public class MatriculaGestorServiceImpl implements IMatriculaGestorService {

	@Autowired
	public IMatriculaRepository matriculaRepository;
	@Autowired
	public IVehiculoRepository vehiculoRepository;
	@Autowired
	public IPropietarioRepository propietarioRepository;
	@Autowired
	public Propietario propietario;
	@Autowired
	public Vehiculo vehiculo;
	@Autowired
	public Matricula matricula;
	@Autowired 
	@Qualifier("Liviano")
	public IMatriculaService matriculasLivianoService;

	@Qualifier("Pesado")
	public IMatriculaService imatriculaPesadoService;
	
	
	@Override
	public void generar(String cedula, String placa) {
		// TODO Auto-generated method stub
	
		
		propietario = this.propietarioRepository.buscar(cedula);
		vehiculo = this.vehiculoRepository.buscar(placa);
		
		BigDecimal valorMatricula ;
		BigDecimal precio = vehiculo.getPrecio();
		if(precio.compareTo(new BigDecimal(2000))>0) {
			BigDecimal descuento = precio.multiply(new BigDecimal(0.07));
			precio.subtract(descuento);	
		}
		
		matricula.setPropietario(propietario);
		
		matricula.setFecha(LocalDateTime.now());
		this.matriculaRepository.generar(cedula, placa);
		
	}
	
}
