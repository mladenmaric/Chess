package figure;

import ostalo.*;

public abstract class Figura
{
	private int i;
	private int j;
	private Figurica figurica;
	private Igrac boja;
	Engine engine;
	
	public Figura(int i, int j, Figurica figurica, Igrac boja, Engine engine)
	{
		super();
		this.i = i;
		this.j = j;
		this.figurica = figurica;
		this.boja = boja;
		this.engine = engine;
	}
	
	public abstract boolean pomeriFiguru(int x, int y);

	public int getI()
	{
		return i;
	}

	public void setI(int i)
	{
		this.i = i;
	}

	public int getJ()
	{
		return j;
	}

	public void setJ(int j)
	{
		this.j = j;
	}

	public Figurica getFigurica()
	{
		return figurica;
	}

	public void setFigurica(Figurica figurica)
	{
		this.figurica = figurica;
	}

	public Igrac getBoja()
	{
		return boja;
	}

	public void setBoja(Igrac boja)
	{
		this.boja = boja;
	}
	
	
	
}
