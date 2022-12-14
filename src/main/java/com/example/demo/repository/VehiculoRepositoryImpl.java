package com.example.demo.repository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;

@Repository

public class VehiculoRepositoryImpl implements IVehiculoRepository {
	public static List<Vehiculo> baseDeDatos = new ArrayList<>();
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo v = new Vehiculo();
		v.setMarca("Renault");
		v.setPlaca("PVH123");
		v.setPrecio(new BigDecimal(30000));
		v.setTipo("Liviano");
		baseDeDatos.add(v);
		
	}

	@Override
	public void buscar(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		
	}

}
