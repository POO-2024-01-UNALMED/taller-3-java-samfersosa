package taller3.televisores;
public class Control {
TV tv;
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
	public int setCanal(int canal)
	{
		this.canal = canal;
	}
	public int setVolumen(int volumen)
	{
		this.volumen = volumen;
	}
	public TV enlazar(TV tv)
	{
		this.tv = tv;
		tv.setControl(this);
	}
	public TV setTv(TV tv)
	{
		this.tv = tv;
	}
	public TV getTv()
	{
		return tv;
	}
}
