package gestion;
import java.util.ArrayList;

public class Zoologico 
{
	private String nombre;
	private String ubicacion;
	
	private ArrayList<Zona> zonas;
	
	public Zoologico(String nombre, String ubicacion)
	{
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public Zoologico()
	{

	}
	
	public void agregarZonas(Zona zona)
	{
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales()
	{
		int ttl = 0;
		for(int i = 0; i < zonas.size(); i++)
		{
			ttl += this.zonas.get(i).cantidadAnimales();
		}
		
		return ttl;
	}
	
	public void setNombre(String nm)
	{
		this.nombre = nm;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setUbicacion(String nm)
	{
		this.ubicacion = nm;
	}
	
	public String getUbicacion()
	{
		return this.ubicacion;
	}
	
	public void setZonas(ArrayList<Zona> arr)
	{
		this.zonas = arr;
	}
	
	public ArrayList<Zona> getZonas()
	{
		return this.zonas;
	}
}
