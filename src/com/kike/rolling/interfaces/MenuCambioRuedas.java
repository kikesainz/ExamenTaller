package com.kike.rolling.interfaces;

import java.util.Scanner;

import com.kike.rolling.entidades.Neumaticos;

public class MenuCambioRuedas {
	
	public Neumaticos muestraMenu(Scanner sc) {
		
		System.out.println("Dígame la marca de los neumáticos ");
		String marca = sc.nextLine();
		System.out.println("Digame el precio de los neumáticos");
		Double precio = Double.parseDouble(sc.nextLine());
		
		return new Neumaticos(marca, precio);
		
	}

}
