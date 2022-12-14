package com.example.demo.repository;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;

public interface IPropietarioRepository {

	
	public void insertar(Propietario propietario);
	
	//Crud
	
	public Propietario buscar(String cedula);
	
	public void actualizar(Propietario propietario);
	
	public void borrar(String cedula);
	
}
