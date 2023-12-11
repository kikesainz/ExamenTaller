package com.kike.rolling.interfaces;

import java.util.Scanner;

import com.kike.rolling.entidades.Cliente;

public class MenuAltaCliente {
	
	public Cliente muestraMenu(Scanner sc) {
		
		System.out.println("Dígame el dni del cliente");
		String dni = sc.nextLine();
		System.out.println("Digame el nombre del cliente");
		String nombre = sc.nextLine();
		System.out.println("Dígame la edad del cliente");
		Integer edad = Integer.parseInt(sc.nextLine());
		System.out.println("Dígame la ciudad de residencia del cliente");
		String ciudad = sc.nextLine();
		
		Cliente cliente = new Cliente(dni, nombre, edad, ciudad);
		return cliente;
	}

}
