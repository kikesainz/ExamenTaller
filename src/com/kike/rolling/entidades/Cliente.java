package com.kike.rolling.entidades;

public class Cliente {
	
	private String dni;
	private String nombre;
	private Integer edad;
	private String ciudad;
	private Coche coche;
	
	public Cliente(String dni, String nombre, Integer edad, String ciudad, Coche coche) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		this.coche = coche;
	}
	
	
	public Cliente(String dni, String nombre, Integer edad, String ciudad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.ciudad = ciudad;
		System.out.println("Cliente creado");
	}


	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Coche getCoche() {
		return coche;
	}
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
	public Double calculaDescuento() {
		Double descuento = 0.0;
//			Si el cliente tiene entre 18 y 23 años se le aplicará un descuento del 20%.
//			Si el cliente tiene entre 24 años y 29 se le aplicará un decuento del 10%.
//			Si el cliente no es de Salamanca se añadirá un descuento del 10%.

		if (this.edad >= 18 && this.edad <= 23 ) {
			descuento = 0.2;
		} else if (this.edad >= 24 && this.edad <= 29 ) {
			descuento += 0.1;
		} 
		
		if (!this.ciudad.equals("Salamanca")) descuento += 0.1;
		
		return descuento;
	}

}
