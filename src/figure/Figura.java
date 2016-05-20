package figure;

import glavni.*;

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
	
	public void pomeriFiguru(int x, int y) throws Exception
	{
		int i = getI(), j = getJ();
		Figura novaFigura = new NemaFigure(i, j, engine);
		Figura[] dozvoljenaPolja = getDozvoljenaPolja();
		
		for (int p = 0; p < dozvoljenaPolja.length && dozvoljenaPolja[p] != null; p++)
			if (dozvoljenaPolja[p].getI() == x && dozvoljenaPolja[p].getJ() == y)
			{
				this.setI(x);
				this.setJ(y);
				engine.setTablaIJ(this);
				engine.setTablaIJ(novaFigura);
				return;
			}

		throw new Exception("Ne mozes tu da stanes!");
	}
	
	public abstract Figura[] getDozvoljenaPolja();

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
