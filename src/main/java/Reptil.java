package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal{

	private static ArrayList<Reptil> listado;
	public static int serpientes;
	public static int iguanas;
	
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String color, int largoCola)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		
		this.colorEscamas = color;
		this.largoCola = largoCola;
	}
	
	public static int cantidadReptiles()
	{
		return serpientes + iguanas;
	}
	
	public static Reptil crearIguana(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		Reptil igu = new Reptil(nombre, edad, habitat, genero, zona, "verde", 3);
		igu.colorEscamas = "verde";
		igu.largoCola = 3;
		igu.habitat = "humedal";
		listado.add(igu);
		Reptil.iguanas += 1;
		Animal.totalAnimales += 1;
		
		return igu;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		Reptil ser = new Reptil(nombre, edad, habitat, genero, zona, "blanco", 1);
		ser.colorEscamas = "blanco";
		ser.largoCola = 1;
		ser.habitat = "jungla";
		listado.add(ser);
		Reptil.serpientes += 1;
		Animal.totalAnimales += 1;
		
		return ser;
	}
	
	public void setColorEscamas(String color)
	{
		this.colorEscamas = color;
	}
	
	public String getColorEscamas()
	{
		return this.colorEscamas;
	}
	
	public void setLargoCola(int l)
	{
		this.largoCola = l;
	}
	
	public int getLargoCola()
	{
		return this.largoCola;
	}
	
	public static void setListado(ArrayList<Reptil> arr)
	{
		Reptil.listado = arr;
	}
	
	public static ArrayList<Reptil> getListado()
	{
		return Reptil.listado;
	}
	
	
}
