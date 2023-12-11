package com.kike.rolling.entidades;

public class Neumaticos {
	
	private String marca;
	private Double precio;
	
	
	
	public Neumaticos(String marca, Double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	

}
