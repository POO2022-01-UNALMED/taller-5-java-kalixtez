package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String color, boolean venenoso)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		
		this.colorPiel = color;
		this.venenoso = venenoso;
	}
	
	public static int cantidadAnfibios()
	{
		return ranas + salamandras;
	}
	
	public static Anfibio crearRana(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		Anfibio rana = new Anfibio(nombre, edad, habitat, genero, zona, " ", false);
		rana.colorPiel = "rojo";
		rana.venenoso = true;
		rana.habitat = "selva";
		listado.add(rana);
		Anfibio.ranas += 1;
		Animal.totalAnimales += 1;
		
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		Anfibio sal = new Anfibio(nombre, edad, habitat, genero, zona, " ", false);
		sal.colorPiel = "negro y amarillo";
		sal.venenoso = false;
		sal.habitat = "selva";
		listado.add(sal);
		Anfibio.salamandras += 1;
		Animal.totalAnimales += 1;
		
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
	
	public boolean getVenenoso()
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
