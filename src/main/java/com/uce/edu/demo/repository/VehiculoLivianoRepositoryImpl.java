package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

@Repository
@Qualifier("liviano")
public class VehiculoLivianoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha guardado en la base de datos: " + v);

		if (v.getPrecio().compareTo(new BigDecimal(0)) == 0 || v.getPrecio().compareTo(new BigDecimal(0)) == -1) {
			System.out.println("El precio es incorrecto");

		} else if (v.getPrecio().compareTo(new BigDecimal(10000)) == -1
				|| v.getPrecio().compareTo(new BigDecimal(10000)) == 0) {
			System.out.println("precio demaciado bajo del promedio");
		} else
			System.out.println("El precio es correcto");

	}
	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elimiar(String placa) {
		// TODO Auto-generated method stub
		
	}

}
