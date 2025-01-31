package t6_ejer20;

import java.util.HashMap;
import java.util.Scanner;

public class T6_ejer20 {
	static HashMap <String,Integer> paises= new HashMap<>();

	public static void mostrarMenu() {
		System.out.println("Opciones 1-8");
		System.out.println("1. Añadir un nuevo país con sus habitantes");
		System.out.println("2. Borrar un país");
		System.out.println("3. Mostrar el nº de habitantes de un país");
		System.out.println("4. Listar todos los nombres de los países");
		System.out.println("5. Listar cada país con sus habitantes");
		System.out.println("6. Eliminar todo ");
		System.out.println("7. Buscar el pais con más habitantes");
		System.out.println("8. Salir");
	}
	
	
	public static void añadirPais(String nombre,Integer num){
			paises.put(nombre,num);
	}
	
	public static void mostrarHab(String nombre) {
		System.out.println("El numero de habitantes es " + paises.get(nombre));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T6_ejer20 t=new T6_ejer20();
		Scanner entrada=new Scanner(System.in);
		int opcion=0;
		Integer numero_habitantes=0;
		String nombre_pais;
		Integer mayor_hab=0;
		String pais_mayor="";
		do {
		T6_ejer20.mostrarMenu();
		opcion=entrada.nextInt();
		switch(opcion) {
		case 1:
			System.out.println("Añade el nombre del país");
			nombre_pais=entrada.next();
		
			System.out.println("Añade los habitantes del país");
			numero_habitantes=entrada.nextInt();
			
			T6_ejer20.añadirPais(nombre_pais, numero_habitantes);
			System.out.println(paises);
			break;
			
		case 2:
			System.out.println("Dime que país quieres borrar");
			nombre_pais=entrada.next();
			paises.remove(nombre_pais);
			break;
		case 3:
			System.out.println("Dime de que país quieres ver los habitantes");
			nombre_pais=entrada.next();
			T6_ejer20.mostrarHab(nombre_pais);
			break;
		case 4:
			System.out.println("Los países son: " + paises.keySet());
			break;
			
		case 5:
			for(String nom:paises.keySet()) {
				System.out.println(nom + " "+paises.get(nom));
			}
			break;
		
		case 6:
			paises.clear();
			System.out.println("Se han borrado todos los paises");
			break;
			
		case 7:
	
			for(String nom:paises.keySet()) {
				if(paises.get(nom)>mayor_hab) {
					pais_mayor=nom;
					mayor_hab=paises.get(nom);
				}
			}
			System.out.println("El pais con mayor habitantes es " + pais_mayor);
			break;
		
		case 8:
			System.out.println("Saliendo");
		}
		}while(opcion!=8);
	}

}
