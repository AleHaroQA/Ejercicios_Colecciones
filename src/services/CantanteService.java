package services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import entities.CantanteFamoso;

public class CantanteService {

		private List<CantanteFamoso> listaCantante;
		private Scanner sc;

		public CantanteService() {
			this.listaCantante = new ArrayList<CantanteFamoso>();
			this.sc = new Scanner(System.in);
		}

		boolean salir = false;
		public void menu() {
			do {
			System.out.println("--------------- MENU ----------------");
			System.out.println("1.- Crear y agregar un cantante a la lista");
			System.out.println("2.- Mostrar canantes");
			System.out.println("3.- Eliminar cantante de la lista");
			System.out.println("4.- Salir");
			int resp = sc.nextInt();
			switch (resp) {
			case 1:
				agregarCantante(crearCantantes());
				break;
			case 2:
				mostrarCantantes();
				break;
			case 3:
				eliminarCantante();
				break;
			case 4:
				System.out.println("Hasta luego!");
				salir = true;
				break;
			default:
				System.out.println("Ingrese una opci�n v�lida");
				break;
			}
		}while(!salir);
		}
		public CantanteFamoso crearCantantes() {
			System.out.println("Vamos a crear un cantante");
			System.out.println("Indica el nombre del cantante");
			String nombre = sc.next();
			System.out.println("Indica su disco con mas ventas");
			String disco = sc.next();
			CantanteFamoso cantante = new CantanteFamoso(nombre,disco);
		
			return cantante;
		}
		
		public void agregarCantante(CantanteFamoso cantante) {
				listaCantante.add(cantante);
		}
		
			
		public void mostrarCantantes() {
			for (CantanteFamoso cantante : listaCantante) {
				System.out.println(cantante);
			}
		}
		
		public void eliminarCantante() {
			System.out.println("Indique el nombre del cantante que desea eliminar");
			String cantanteEliminar = sc.next();
			boolean valida = false;
			Iterator<CantanteFamoso> it = listaCantante.iterator();
			while(it.hasNext()) {
				CantanteFamoso c = it.next();
				if(c.getNombre().equalsIgnoreCase(cantanteEliminar)) {
					it.remove();
					valida = true;
				}
			}
			if(valida) {
				System.out.println("El cantante ha sido eliminado existosamente de la lista");
				mostrarCantantes();
			}else {
				System.out.println("El cantante ingresado no se encuentra en la lista");
			}
			
		}
}
