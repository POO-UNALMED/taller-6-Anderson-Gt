package vehiculos;
import java.util.*;
public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante>listaf = new ArrayList<Fabricante>();
	ArrayList<Vehiculo>listav = new ArrayList<Vehiculo>();
	public Fabricante(String nombre,Pais pais) {
		this.setNombre(nombre);
		this.setPais(pais);		
		Fabricante.listaf.add(this);
		this.pais.listaf.add(this);
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais=pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante aux = null;
		if(listaf.size()!=0) {
			aux=listaf.get(0);			
		}
		for(Fabricante x:listaf) {
			if(x.listav.size()>aux.listav.size()) {
				aux=x;
			}
		}return aux;
	}
}
