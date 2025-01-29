package t6_ejer17;
//marcos pallaso perezoso
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class T6_ejer17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista=new ArrayList<>();
		List<Integer> lista_pares=new ArrayList<>();

		Random azar=new Random();
		for(int i=0;i<10;i++) {
			lista.add(azar.nextInt(101));	
			if(lista.get(i)%2==0) {
				lista_pares.add(lista.get(i));
			}
		}
		System.out.println("Lista con pares e impares " + lista);
		System.out.println("Lista de solo pares " + lista_pares);
		System.out.println("HOLA que tal");
	}

}
