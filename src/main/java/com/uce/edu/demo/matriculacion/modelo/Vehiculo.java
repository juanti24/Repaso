package com.uce.edu.demo.matriculacion.modelo;

import java.math.BigDecimal;

public class Vehiculo {

	private String marca;
	private String pais;
	private String placa;
	private String tipo;
	private Propietario propietario;
	private BigDecimal precio;
	private BigDecimal valorMatricula;

	// SET Y GET
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", pais=" + pais + ", placa=" + placa + ", tipo=" + tipo + ", propietario="
				+ propietario + ", precio=" + precio + ", valorMatricula=" + valorMatricula + "]";
	}

}
