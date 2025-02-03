package t4_ejer12;

public class Cliente {
	String nombre;
	double dinero;
	
	Cliente(){
		this.nombre="";
		this.dinero=0;
	}
	
	Cliente(String nombre, double dinero){
		this.dinero=dinero;
		this.nombre=nombre;
	}

	double getDinero() {
		return this.dinero;
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	void setDinero(double dinero) {
		this.dinero=dinero;
	}
	
	void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
}
