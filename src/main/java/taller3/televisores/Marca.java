package taller3.televisores;

public class Marca {
private String nombre;

	private Marca(String nombre) 
		{
		this.nombre = nombre;
		}
	public String marcaGet() 
		{
		return nombre;
		}
	public void marcaSet(String nombre)
		{
		this.nombre = nombre;
		}

	
}
