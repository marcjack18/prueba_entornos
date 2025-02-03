package t4_ejer12;

public class Producto {
	String nombre;
	double precio;
	int stock;
	
	Producto(){
	}
	
	Producto(String nombre,double precio, int stock){
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
	}
	double getPrecio(){
		return this.precio;
	}
	
	int getStock(){
		return this.stock;
	}

	
	String getNombre(){
		return this.nombre;
	}

	void setPrecio(double precio) {
		this.precio=precio;
	}

	void setNombre(String nombre) {
		this.nombre=nombre;
	}

	void setStock(int stock) {
		this.stock=stock;
	}

}
