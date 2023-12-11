package com.kike.rolling.entidades;

public class Coche {
	
	private String marca;
	private Integer anno;
	private Neumaticos neumaticos;
	
	public Coche(String marca, Integer anno) {
		super();
		this.marca = marca;
		this.anno = anno;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getAnno() {
		return anno;
	}
	public void setAnno(Integer anno) {
		this.anno = anno;
	}


	public Neumaticos getNeumaticos() {
		return neumaticos;
	}


	public void setNeumaticos(Neumaticos neumaticos) {
		this.neumaticos = neumaticos;
		System.out.println("Neumáticos  "+neumaticos.getMarca()+ " asignados al coche "+ this.marca);
	}
	

	
	

}
