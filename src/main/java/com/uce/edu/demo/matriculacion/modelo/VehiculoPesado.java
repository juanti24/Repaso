package com.uce.edu.demo.matriculacion.modelo;

public class VehiculoPesado extends Vehiculo {
	
	private double pesoToneladas;
	
	
	//SET Y GET
	public double getPesoToneladas() {
		return pesoToneladas;
	}

	public void setPesoToneladas(double pesoToneladas) {
		this.pesoToneladas = pesoToneladas;
	}

	@Override
	public String toString() {
		return "VehiculoPesado [pesoToneladas=" + pesoToneladas + ", getPesoToneladas()=" + getPesoToneladas()
				+ ", getMarca()=" + getMarca() + ", getPais()=" + getPais() + ", getPlaca()=" + getPlaca()
				+ ", getTipo()=" + getTipo() + ", getPropietario()=" + getPropietario() + ", getValorMatricula()="
				+ getValorMatricula() + ", getPrecio()=" + getPrecio() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	

}
