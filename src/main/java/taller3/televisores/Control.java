package taller3.televisores;
public class Control {
TV tv;
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
	public void setCanal(int canal)
	{
		this.canal = canal;
	}
	public void setVolumen(int volumen)
	{
		this.volumen = volumen;
	}
	public void enlazar(TV tv)
	{
		this.tv = tv;
		tv.setControl(this);
	}
	public void setTv(TV tv)
	{
		this.tv = tv;
	}
	public TV getTv()
	{
		return tv;
	}
}
