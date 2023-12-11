package com.kike.rolling.interfaces;

import java.util.Scanner;

import com.kike.rolling.entidades.Cliente;
import com.kike.rolling.entidades.Coche;
import com.kike.rolling.entidades.Neumaticos;

public class MenuPrincipal {

	Cliente cliente;
	Coche coche;
	Neumaticos neumaticos;

	public void muestraMenu() {

		Scanner sc = new Scanner(System.in);
		Integer opcion;
		do {

			System.out.println("****Aplicación de gestión taller ****");
			System.out.println("****ROLLING WHEELS****");
			System.out.println("1. Dar de alta cliente");
			System.out.println("2. Dar de alta coche");
			System.out.println("3. Servicio de cambio de ruedas");
			System.out.println("4. Emisión de factura");
			System.out.println("5. Salir de la aplicación");

			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {

			case 1:
				MenuAltaCliente ma = new MenuAltaCliente();
				cliente = ma.muestraMenu(sc);
				break;
			case 2:

				if (cliente == null) {
					System.err.println("WARNING: NO HAY UN CLIENTE CREADO!!! no se asigna a ningún cliente");
					System.err.println("Debe crear primero un cliente y luego un coche");
				} else {
					MenuAltaCoche mc = new MenuAltaCoche();
					coche = mc.muestraMenu(sc);
					System.out.println("Asignando coche con marca: " + coche.getMarca() + " a cliente: "
							+ this.cliente.getNombre());
					cliente.setCoche(coche);
				}
				break;
			case 3:
				if (cliente == null || coche == null) {
					System.err.println("DEBE CREAR ANTES UN COCHE");
				} else {
					neumaticos = new MenuCambioRuedas().muestraMenu(sc);
					coche.setNeumaticos(neumaticos);
				}
				break;

			case 4:
				if (cliente == null || coche == null || neumaticos == null) {
					System.err.println(
							"WARNING!! NO SE PUEDE EMITIR FACTURA, DEBE CREAR ANTES UN CLIENTE Y UN COCHE.");
				} else {
					new MenuCreacionFactura().creaFactura(cliente, coche, neumaticos);
				}
				break;
			case 5:
				System.out.println("bye!");
				return;

			}
		} while (opcion != 5);

	}

}
