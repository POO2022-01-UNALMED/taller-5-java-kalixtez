package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal
{
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String color, int ca)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		
		this.colorEscamas = color;
		this.cantidadAletas = ca;
	}
	
	public static int cantidadPeces()
	{
		return salmones + bacalaos;
	}
	
	public static Pez crearSalmon(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		Pez salm = new Pez(nombre, edad, habitat, genero, zona, "rojo", 6);
		salm.colorEscamas = "rojo";
		salm.cantidadAletas = 6;
		salm.habitat = "oceano";
		listado.add(salm);
		Pez.salmones += 1;
		
		return salm;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		Pez bac = new Pez(nombre, edad, habitat, genero, zona, "gris", 6);
		bac.colorEscamas = "gris";
		bac.cantidadAletas = 6;
		bac.habitat = "oceano";
		listado.add(bac);
		Pez.bacalaos += 1;
		
		return bac;
	}
	
	public void setColorEscamas(String color)
	{
		this.colorEscamas = color;
	}
	
	public String getPelaje()
	{
		return this.colorEscamas;
	}
	
	public void setCantidadAletas(int ca)
	{
		this.cantidadAletas = ca;
	}
	
	public int getCantidadAletas()
	{
		return this.cantidadAletas;
	}
	
	public static void setListado(ArrayList<Pez> arr)
	{
		Pez.listado = arr;
	}
	
	public static ArrayList<Pez> getListado()
	{
		return Pez.listado;
	}
	
	@Override
	public String movimiento()
	{
		return "nadar";
	}
}
