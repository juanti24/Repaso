package com.uce.edu.demo;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.modelo.VehiculoLiviano;
import com.uce.edu.demo.matriculacion.modelo.VehiculoPesado;
import com.uce.edu.demo.matriculacion.service.GestorMatriculaImpl;

@SpringBootApplication
public class MatriculacionApplication implements CommandLineRunner {

	
	@Autowired
	private GestorMatriculaImpl gm;
	
	public static void main(String[] args) {
		SpringApplication.run(MatriculacionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo v1 = new VehiculoLiviano();
		Vehiculo v2 = new VehiculoPesado();
		Propietario p1 = new Propietario();
		
		
		p1.setNombre("Juan");
		p1.setApellido("Jumbo");
		p1.setCedula("1723920979");
		
		v1.setMarca("Toyota");
		v1.setPais("España");
		v1.setPrecio(new BigDecimal(-20));
		v1.setPlaca("P548");
		v1.setPropietario(p1);
		
		
		v2.setMarca("Chevrolet");
		v2.setPais("EEUU");
		v2.setPrecio(new BigDecimal(8000));
		v2.setPlaca("PXF889");
		v2.setPropietario(p1);
		
		System.out.println("**********Vehiculo 1*************");
		
	    gm.imprimirVehiculo(v1);
	    gm.matricularVehiculo(v1);
	
		
		gm.imprimirVehiculo(v2);
		gm.matricularVehiculo(v2);
		
	}

}
