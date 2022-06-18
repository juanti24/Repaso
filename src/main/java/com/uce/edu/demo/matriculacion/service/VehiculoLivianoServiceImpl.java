package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

@Service
@Qualifier("liviano")
public class VehiculoLivianoServiceImpl implements IVehiculoService {

	@Override
	public BigDecimal calcularValorM(Vehiculo v) {
		// TODO Auto-generated method stub
		BigDecimal valor = v.getPrecio().multiply(new BigDecimal(0.10));
		
		return valor;
	}

}
