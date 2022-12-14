package com.example.demo.repository;

import com.example.demo.modelo.Matricula;

public interface IMatriculaRepository {
	
	public void generar(String cedula, String placa);
	
	//Crud
	
	public void buscar(String placa);
	
	public void actualizar(Matricula propietario);
	
	public void borrar(String placa);
	
}
