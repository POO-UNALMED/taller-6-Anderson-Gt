package vehiculos;
import java.util.*;

public class Pais {
	
	ArrayList<Fabricante>listaf = new ArrayList<Fabricante>();
	private static ArrayList<Pais>listap = new ArrayList<Pais>();
	private String nombre;
	private static int cantidadf;
	
	public Pais() {
		
	}
	public Pais(String nombre) {
		this.setNombre(nombre);
		listap.add(this);
	}
	public static void aumFabricas() {
		cantidadf++;
		
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int cantidadvh() {
		int aux = 0;
		for(Fabricante x:listaf) {
			aux = aux + x.listav.size();
		}return aux;
	}
	public int getFabricas() {
		return cantidadf;
	}
	
	public static Pais paisMasVendedor() {
		Pais n=null;
		int r=0;
		for(int i=0;i<listap.size();i++) {
			if(Collections.frequency(listap, listap.get(i))>r) {
				n=listap.get(i);
				r=Collections.frequency(listap, listap.get(i));
			}
		}
		return n;
		
	
		
		
	}
}
