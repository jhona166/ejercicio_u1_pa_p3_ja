package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {
	public static List<Propietario> baseDeDatos = new ArrayList<>();


	@Override
	public void buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario prop = new Propietario();
		for(Propietario cb:baseDeDatos ) {
				if(cb.getCedula().equals(cedula)) {
					prop=cb;
				System.out.println("Se ha encontrado"+prop.getNombre());
				}
			
		}
		
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
	System.out.println("Se ha actualizado el propietario: "+propietario);	
	}

	@Override
	public void borrar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el propietario: "+cedula);	
	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base de datos"+propietario);
		baseDeDatos.add(propietario);
	}
	

}
