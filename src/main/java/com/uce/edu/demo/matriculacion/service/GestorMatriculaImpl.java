package com.uce.edu.demo.matriculacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.modelo.VehiculoLiviano;
import com.uce.edu.demo.repository.IVehiculoRepository;

@Service
public class GestorMatriculaImpl implements IGestorMatricula {
	
	
	@Autowired
	@Qualifier("liviano")
	private IVehiculoRepository iVehiculoRespository ;
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoRepository iVehiculoRespository1 ;
	
	@Autowired
	@Qualifier("liviano")
	private IVehiculoService iVehiculoService;
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoService iVehiculoService1;

	@Override
	public void matricularVehiculo(Vehiculo v) {
		if (v.getClass() .equals(VehiculoLiviano.class)) {
			this.iVehiculoRespository.insertar(v);
		}
		
		this.iVehiculoRespository1.insertar(v);
	}


	@Override
	public void imprimirVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		
		if (v.getClass() .equals(VehiculoLiviano.class)) {
			v.setValorMatricula(this.iVehiculoService.calcularValorM(v));
			System.out.println(v);
		}else {
			v.setValorMatricula(this.iVehiculoService1.calcularValorM(v));
			System.out.println(v);
		}
		
	}

}
