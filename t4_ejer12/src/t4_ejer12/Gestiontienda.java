package t4_ejer12;
import java.util.Scanner;
public class Gestiontienda {

	void mostrarMenu(){
		System.out.println("Opciones 1-11");
		System.out.println("1. Crear un nuevo producto");
		System.out.println("2. Modificar el nombre del producto");
		System.out.println("3. Modificar el precio del producto");
		System.out.println("4. Modificar el stock del producto");
		System.out.println("5. Mostrar datos del producto");
		
		System.out.println("6. Crear nuevo cliente");
		System.out.println("7. Modificar el nombre del cliente");
		System.out.println("8. Modificar el dinero del cliente");
		System.out.println("9. Mostrar datos del cliente");
		
		System.out.println("10. Proceso de compra");
		System.out.println("11. Salir");
	}
	
	
	void mostrarProducto(Producto p) {
		System.out.println("Nombre del producto: " + p.getNombre());
		System.out.println("Precio del producto: " + p.getPrecio() +"€");
		System.out.println("Stock del producto: " + p.getStock());
	}
	
	void mostrarCliente(Cliente c) {
		System.out.println("Nombre del cliente: " + c.getNombre());
		System.out.println("Dinero del cliente: " + c.getDinero() +"€");
	}
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int opcion,stock,stock_a_comprar;
		double precio,dinero_cliente;
		String nombre,nombre_cliente;
		Gestiontienda g=new Gestiontienda();
		Producto p=new Producto();
		Cliente c=new Cliente();
		do {
			g.mostrarMenu();
			opcion=entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduce el nombre");
				entrada.nextLine();
				nombre=entrada.nextLine();
				System.out.println("Introduce el precio");
				precio=entrada.nextInt();
				entrada.nextLine();
				System.out.println("Introduce el stock del producto");
				stock=entrada.nextInt();
				entrada.nextLine();
				p=new Producto(nombre,precio,stock);
				break;
				
			case 2:
				System.out.println("Introduce el nuevo nombre");
				nombre=entrada.nextLine();
				p.setNombre(nombre);
				break;
			case 3:
				System.out.println("Introduce el nuevo precio");
				precio=entrada.nextInt();
				entrada.nextLine();
				p.setPrecio(precio);
				break;
			case 4:
				System.out.println("Introduce el nuevo stock del producto");
				stock=entrada.nextInt();
				entrada.nextLine();
				p.setStock(stock+p.getStock());
				break;
				
			case 5:
				g.mostrarProducto(p);
				break;
				
			case 6:
				System.out.println("Introduce el nombre del cliente");
				entrada.nextLine();
				nombre_cliente=entrada.nextLine();

				System.out.println("Introduce el dinero");
				dinero_cliente=entrada.nextInt();
				entrada.nextLine();
				c=new Cliente(nombre_cliente,dinero_cliente);
				break;
				
			case 7:
				System.out.println("Introduce el nuevo nombre del cliente");
				nombre_cliente=entrada.nextLine();
				c.setNombre(nombre_cliente);
				break;
			case 8:
				System.out.println("Introduce el nuevo precio");
				dinero_cliente=entrada.nextInt();
				entrada.nextLine();
				c.setDinero(dinero_cliente);
				break;
				
				
			case 9:
				g.mostrarCliente(c);
				break;
				
			case 10:
				
				if(p.stock<=0) {
					System.out.println("No queda stock del producto");
					
				}else if(c.getDinero()<p.precio){
					System.out.println("No tienes dinero suficiente");
				}else {
					
					System.out.println("¿Cuantas unidades vas a querer?");
					stock_a_comprar=entrada.nextInt();
					if(stock_a_comprar>p.getStock()) {
						System.out.println("Solo queda este stock: " +p.getStock());
			
						c.setDinero(c.dinero-=(p.precio*p.getStock()));
						p.setStock(p.getStock()-p.getStock());
					}
				
				System.out.println("Tu saldo es de " + c.getDinero() + "€");
				System.out.println("Y el precio del producto es de " + p.getPrecio() +"€");
				
				c.setDinero(c.dinero-=(p.precio*stock_a_comprar));
				p.setStock(p.getStock()-stock_a_comprar);
				
				System.out.println("Te has quedado con este dinero " + c.getDinero() + "€");
				}
				
				break;
			case 11:
				System.out.println("Fin de operaciones");
				break;
			default: System.out.println("Opcion incorrecta");	
			}	
}while(opcion !=11);
	

}}
