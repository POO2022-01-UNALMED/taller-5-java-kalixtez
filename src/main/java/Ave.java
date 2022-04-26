package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal
{
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String color)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		
		this.colorPlumas = color;
	}
	
	public static int cantidadAves()
	{
		return halcones + aguilas;
	}
	
	public static Ave crearHalcon(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		Ave halcon = new Ave(nombre, edad, habitat, genero, zona, " ");
		halcon.colorPlumas = "cafe glorioso";
		halcon.habitat = "montanas";
		listado.add(halcon);
		Ave.halcones += 1;
		Animal.totalAnimales += 1;
		
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		Ave ag = new Ave(nombre, edad, habitat, genero, zona, " ");
		ag.colorPlumas = "blanco y amarillo";
		ag.habitat = "montanas";
		listado.add(ag);
		Ave.aguilas += 1;
		Animal.totalAnimales += 1;
		
		return ag;
	}
	
	public void setColorPlumas(String color)
	{
		this.colorPlumas = color;
	}
	
	public String getColorPlumas()
	{
		return this.colorPlumas;
	}
	
	public static void setListado(ArrayList<Ave> arr)
	{
		Ave.listado = arr;
	}
	
	public static ArrayList<Ave> getListado()
	{
		return Ave.listado;
	}
	
}
