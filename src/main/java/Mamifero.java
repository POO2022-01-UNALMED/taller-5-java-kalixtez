package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal 
{
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public static int cantidadMamiferos()
	{
		return caballos + leones;
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		Mamifero caballo = new Mamifero(nombre, edad, habitat, genero, zona, true, 4);
		caballo.pelaje = true;
		caballo.patas = 4;
		caballo.habitat = "pradera";
		listado.add(caballo);
		Mamifero.caballos += 1;
		Animal.totalAnimales += 1;
		
		return caballo;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		Mamifero leon = new Mamifero(nombre, edad, habitat, genero, zona, true, 4);
		leon.pelaje = true;
		leon.patas = 4;
		leon.habitat = "selva";
		listado.add(leon);
		Mamifero.leones += 1;
		Animal.totalAnimales += 1;
		
		return leon;
	}
	
	public void setPelaje(boolean pelaje)
	{
		this.pelaje = pelaje;
	}
	
	public boolean getPelaje()
	{
		return this.pelaje;
	}
	
	public void setPatas(int patas)
	{
		this.patas = patas;
	}
	
	public int getPatas()
	{
		return this.patas;
	}
	
	public static void setListado(ArrayList<Mamifero> arr)
	{
		Mamifero.listado = arr;
	}
	
	public static ArrayList<Mamifero> getListado()
	{
		return Mamifero.listado;
	}
}
