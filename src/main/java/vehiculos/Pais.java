package vehiculos;

import java.util.*;

public class Pais {
	
	private String nombre;
	private int cantidadVendidos=0;
	private static List<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String nombre) {	
		this.nombre = nombre;		
		Pais.paises.add(this);
		cantidadVendidos++;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadVehiculos() {
		return cantidadVendidos;
	}

	public void setCantidadVehiculos(int cantidadVehiculos) {
		this.cantidadVendidos = cantidadVehiculos;
	}

	public static List<Pais> getPaises() {
		return paises;
	}

	public static void setPaises(List<Pais> paises) {
		Pais.paises = paises;
	}
	
	
    public static Pais paisMasVendedor() {
		
		int vendidos = 0;
		Pais Vendedor = null;
		
		for (int i = 0; i<Pais.paises.size(); i++){	
			int x = Pais.paises.get(i).cantidadVendidos;	
			if (vendidos < x) {		
				vendidos = x;
				Vendedor = Pais.paises.get(i);
			}	
		}
		return Vendedor;
	}
	

}
