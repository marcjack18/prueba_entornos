package t6_ejer7;
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
	
	static void mostrarPersona(Persona per2[]) {
		for(Persona person:per2) {
		System.out.println("Nombre:" + person.getNombre());
		System.out.println("Edad: " + person.getEdad());
	}}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		Persona pers[]=new Persona[5];
		
		String nombre;
		int opcion,edad;
		do {
			GestionPersonas.mostrarMenu();
			opcion=entrada.nextInt();
			entrada.nextLine();
		switch(opcion) {
		case 1:
			System.out.println("Vas a crear 5 personas");
			for(Persona per:pers) {
			System.out.println("Introduce el nombre");
			nombre=entrada.nextLine();
			System.out.println("Introduce la edad");
			edad=entrada.nextInt();
			per=new Persona(nombre,edad);
			
			entrada.nextLine();
			}
			break;
			
		case 2:
			System.out.println("De que persona lo quieres");
			int opcion_array=entrada.nextInt();
			entrada.nextLine();
			System.out.println("Introduce el nuevo nombre");
			nombre=entrada.nextLine();
			
			pers[opcion_array].setNombre(nombre);
			break;
			
		case 3:
			System.out.println("De que persona lo quieres");
			int opcion_array2=entrada.nextInt();
			entrada.nextLine();
			System.out.println("Introduce la nueva edad");
			edad=entrada.nextInt();
			pers[opcion_array2].setEdad(edad);
			break;
		case 4:
	
			GestionPersonas.mostrarPersona(pers);

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