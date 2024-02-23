package taller3.televisores;

public class TV {
Marca marca;
int canal;
private int precio;
boolean estado;
int volumen;
Control control;
private int numTV;

	public TV (Marca marca, boolean estado)
	{}
	
	public TV (int canal, int volumen, int precio)
	{
		canal = 1;
		volumen = 1;
		precio = 500;
	}
	public void setMarca(Marca marca)
	{
		this.marca = marca;
	}
	public void setCanal(int canal)
	{
		this.canal = canal;
	}
	public void setPrecio(int precio)
	{
		this.precio = precio;
	}
	public void setVolumen(int volumen)
	{
		this.volumen = volumen;
	}
	public void setControl(Control control)
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
	public void setNumTV()
	{
		this.numTV = numTV;
	}
	public void turnOn (boolean newEstado)
	{
		estado = newEstado;
	}
	public void turnOff (boolean newEstado)
	{
		estado = newEstado;
	}
	public boolean getEstado()
	{
		return estado;
	}
	public void canalUp ()
	{
		if (estado = true);
		{
			if(canal >= 1 && canal <=120 );
			{
		}
				canal = canal +1;
			}
	}
	public void canalDown ()
	{
		if (estado = true);
		{
			if(canal >= 1 && canal <=120 );
			{
		
				canal = canal -1;
			}
		}
	}
	public void volumenUp ()
	{
		if (estado = true);
		{
			if(volumen >= 0 && canal <=7 );
			{
				volumen = volumen + 1;
			}
		}
	}
	public void volumenDown ()
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

