package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona 
{
	
	private String nombre;
	private Zoologico zoo;
	
	private ArrayList<Animal> animales;
	
	public Zona(){
		
	}
	
	public int cantidadAnimales()
	{
		int ttl = 0;
		for(int i = 0; i < animales.size(); i++)
		{
			if(animales.get(i) != null)
			ttl += 1;
		}
		
		return ttl;
	}
	
	public void agregarAnimales(Animal anim)
	{
		animales.add(anim);
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String n)
	{
		this.nombre = n;
	}
	
	public void setZoo(Zoologico zoo)
	{
		this.zoo = zoo;
	}
	
	public Zoologico getZoo()
	{
		return this.zoo;
	}
	
	public ArrayList<Animal> getAnimales()
	{
		return this.animales;
	}
	
	public void setAnimales(ArrayList<Animal> arr)
	{
		this.animales = arr;
	}
	
}
