package t4_ejer11;
import java.util.Scanner;
public class GestionPersonas {
	static void mostrarMenu() {
		System.out.println("Opciones 1-5");
		System.out.println("1. Crear una nueva persona");
		System.out.println("2. Cambiar el nombre");
		System.out.println("3. Cambiar la edad");
		System.out.println("4. Mostrar datos actuales de la persona");
		System.out.println("5. Salir del programa");

	}
	
	static void mostrarPersona(Persona p) {
		System.out.println("Nombre:" + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		
		Persona p=new Persona();
		
		String nombre;
		int opcion,edad;
		do {
			GestionPersonas.mostrarMenu();
			opcion=entrada.nextInt();
			entrada.nextLine();
		switch(opcion) {
		case 1:
			System.out.println("Introduce el nombre");
			nombre=entrada.nextLine();
			System.out.println("Introduce la edad");
			edad=entrada.nextInt();
			entrada.nextLine();
			p=new Persona(nombre,edad);
			break;
			
		case 2:
			System.out.println("Introduce el nuevo nombre");
			nombre=entrada.nextLine();
			p.setNombre(nombre);
			break;
			
		case 3:
			System.out.println("Introduce la nueva edad");
			edad=entrada.nextInt();
			p.setEdad(edad);
			break;
		case 4:
			GestionPersonas.mostrarPersona(p);
		break;
		case 5:
			System.out.println("Fin de operaciones");
		}
		}while(opcion !=5);
	}}

	class Persona{
	
		String nombre;
		int edad;
		static String ciudad="Valencia";
		Persona(){
			this.nombre="";
			this.edad=0;
		
		}
		
		Persona(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;

		}
		String getNombre() {
			return this.nombre;
	}
		
		int getEdad() {
			return this.edad;
		}
		
		void setNombre(String nombre) {
			this.nombre=nombre;
		}
		
		void setEdad(int edad) {
			this.edad=edad;
		}
	}

	

