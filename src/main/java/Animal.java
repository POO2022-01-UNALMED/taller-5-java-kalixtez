package zooAnimales;
import gestion.Zona;

public class Animal 
{
	
	protected static int totalAnimales;
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	protected Zona zona;
	
	public Animal()
	{
		
	}
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
	}
	
	public String movimiento()
	{
		return "desplazarse";
	}
	
	public String totalPorTipo()
	{
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" + "Aves: " + Ave.cantidadAves() + "\n" + "Reptiles: " + Reptil.cantidadReptiles() + "\n" + "Peces: " + Pez.cantidadPeces() + "\n" + "Anfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString()
	{
		if(this.zona == null)
			return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero;
		
		return "Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre() + ", en el zoo " + this.zona.getZoo().getNombre(); 
	}
	
	public void setNombre(String n)
	{
		this.nombre = n;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setHabitat(String n)
	{
		this.habitat = n;
	}
	
	public String getHabitat()
	{
		return this.habitat;
	}
	
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	
	public int getEdad()
	{
		return this.edad;
	}
	
	public void setGenero(String n)
	{
		this.genero = n;
	}
	
	public String getGenero()
	{
		return this.genero;
	}
	
	public void setZona(Zona zona)
	{
		this.zona = zona;
	}
	
	public Zona getZona()
	{
		return this.zona;
	}
	
}
