package vehiculos;

import java.util.*;

public class Fabricante {
	
	private String nombre;
    private Pais pais;
    private int cantidadVendidos=0;
    private static List<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		
		this.nombre = nombre;
		this.pais = pais;
		
		Fabricante.fabricantes.add(this);
		cantidadVendidos++;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getCantidadVehiculos() {
		return cantidadVendidos;
	}

	public void setCantidadVehiculos(int cantidadVehiculos) {
		this.cantidadVendidos = cantidadVehiculos;
	}

	public static List<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public static void setFabricantes(List<Fabricante> fabricantes) {
		Fabricante.fabricantes = fabricantes;
	}
	
	public static Fabricante fabricaMayorVentas() {
		
		int vendidos = 0;
		Fabricante Vendedor = null;
		
		for (int i = 0; i<Fabricante.fabricantes.size(); i++){
			int x = Fabricante.fabricantes.get(i).cantidadVendidos;
			if (vendidos < x) {
				vendidos = x;
				Vendedor = Fabricante.fabricantes.get(i);
			}
		}
		return Vendedor;
	}
	
	

}
