package vehiculos;
import java.util.*;

public class Pais {
	ArrayList<Fabricante>listaf = new ArrayList<Fabricante>();
	private static ArrayList<Pais>listap = new ArrayList<Pais>();
	private String nombre;
	
	public Pais() {
		
	}
	public Pais(String nombre) {
		this.setNombre(nombre);
		listap.add(this);
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
	public Pais paisMasVendedor() {
		Pais x = null;
		if(listap.size()!=0) {
			x = listap.get(0);
			for(Pais s:listap) {
				if(s.cantidadvh()>x.cantidadvh()) {
					x = s;
				}
			}
		}return x;
	
		
		
	}
}
