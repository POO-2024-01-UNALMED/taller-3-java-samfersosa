package taller3.televisores;

public class TV {
private Marca marca;
int canal;
private int precio;
boolean estado;
int volumen;
Control control;
private int numTV;

	public TV (Marca marca, boolean estado)
	{}
	public String TVEncendido()
	{
		if(estado = true) 
		{
		return "encendido";
		}
		else
		{
		return "apagado";		
		}
	}	
	public TV (int canal, int volumen, int precio)
	{
		canal = 1;
		volumen = 1;
		precio = 500;
	}
	public Marca setMarca(Marca marca)
	{
		this.marca = marca;
	}
	public int setCanal(int canal)
	{
		this.canal = canal;
	}
	public int setPrecio(int precio)
	{
		this.precio = precio;
	}
	public int setVolumen(int volumen)
	{
		this.volumen = volumen;
	}
	public Control setControl(Control control)
	{
		this.control = control;
	}
	public Marca getMarca()
	{
		return marca;
	}
	public int getCanal()
	{
		return canal;
	}
	public int getPrecio()
	{
		return precio;
	}
	public int getVolumen()
	{
		return volumen;
	}
	public Control getControl()
	{
		return control;
	}
	public int getNumTV ()
	{
		return numTV;
	}
	public int setNumTV()
	{
		this.numTV = numTV;
	}
	public boolean turnOn (boolean newEstado)
	{
		estado = newEstado;
	}
	public boolean turnOff (boolean newEstado)
	{
		estado = newEstado;
	}
	public boolean getEstado()
	{
		return estado;
	}
	public int canalUp ()
	{
		if (estado = true);
		{
			if(canal >= 1 && canal <=120 );
			{
		}
				canal = canal +1;
			}
	}
	public int canalDown ()
	{
		if (estado = true);
		{
			if(canal >= 1 && canal <=120 );
			{
		
				canal = canal -1;
			}
		}
	}
	public int volumenUp ()
	{
		if (estado = true);
		{
			if(volumen >= 0 && canal <=7 );
			{
				volumen = volumen + 1;
			}
		}
	}
	public int volumenDown ()
	{
		if (estado = true);
		{
			if(volumen >= 0 && canal <=7 );
			{
				volumen = volumen -1;
			}
		}
	}
	
}

