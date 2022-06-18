package com.uce.edu.demo.matriculacion.modelo;

public class VehiculoLiviano extends Vehiculo   {
	
	private String cilindrajeTurbo;

	//SET Y GET
	public String getCilindrajeTurbo() {
		return cilindrajeTurbo;
	}

	public void setCilindrajeTurbo(String cilindrajeTurbo) {
		this.cilindrajeTurbo = cilindrajeTurbo;
	}

	@Override
	public String toString() {
		return "VehiculoLiviano [cilindrajeTurbo=" + cilindrajeTurbo + ", getCilindrajeTurbo()=" + getCilindrajeTurbo()
				+ ", getMarca()=" + getMarca() + ", getPais()=" + getPais() + ", getPlaca()=" + getPlaca()
				+ ", getTipo()=" + getTipo() + ", getPropietario()=" + getPropietario() + ", getValorMatricula()="
				+ getValorMatricula() + ", getPrecio()=" + getPrecio() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	

}
