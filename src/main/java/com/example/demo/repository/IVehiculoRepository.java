package com.example.demo.repository;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public void insertar(Vehiculo vehiculo);
	
	//Crud
	
	public Vehiculo buscar(String placa);
	
	public void actualizar(Vehiculo vehiculo);
	
	public void borrar(String placa);
	
}
