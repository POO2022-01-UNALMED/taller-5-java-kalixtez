package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String color, boolean venenoso)
	{
		Animal.totalAnimales += 1;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		
		this.colorPiel = color;
		this.venenoso = venenoso;
	}

	public Anfibio()
	{
		Animal.totalAnimales += 1;
	}

	
	
	public static int cantidadAnfibios()
	{
		return ranas + salamandras;
	}
	
	public static Anfibio crearRana(String nombre, int edad, String habitat, String genero)
	{
		Anfibio rana = new Anfibio(nombre, edad, habitat, genero, " ", false);
		rana.colorPiel = "rojo";
		rana.venenoso = true;
		rana.habitat = "selva";
		listado.add(rana);
		Anfibio.ranas += 1;

		
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String habitat, String genero)
	{
		Anfibio sal = new Anfibio(nombre, edad, habitat, genero, " ", false);
		sal.colorPiel = "negro y amarillo";
		sal.venenoso = false;
		sal.habitat = "selva";
		listado.add(sal);
		Anfibio.salamandras += 1;
		
		return sal;
	}
	
	public void setColorPiel(String color)
	{
		this.colorPiel = color;
	}
	
	public String getColorPiel()
	{
		return this.colorPiel;
	}
	
	public void setVenenoso(boolean ven)
	{
		this.venenoso = ven;
	}
	
	public boolean isVenenoso()
	{
		return this.venenoso;
	}
	
	public static void setListado(ArrayList<Anfibio> arr)
	{
		Anfibio.listado = arr;
	}
	
	public static ArrayList<Anfibio> getListado()
	{
		return Anfibio.listado;
	}
	
}
