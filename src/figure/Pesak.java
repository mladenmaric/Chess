package figure;
import glavni.Engine;

public class Pesak extends Figura
{
	public Pesak(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.PESAK, boja, engine);
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

	public Figura[] getDozvoljenaPolja()
	{
		Figura[] dozvoljenaPolja = new Figura[4];
		int i = getI(), j = getJ(), popunjeno = 0;
		
		if (super.getBoja() == Igrac.BELI)
		{
			if (i > 0 && engine.getTablaIJ(i - 1, j) instanceof NemaFigure)
			{
				dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 1, j);
				if (i == 6 && engine.getTablaIJ(i - 2, j) instanceof NemaFigure)
					dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 2, j);					
			}
			
			if (i > 0 && j > 0 && !(engine.getTablaIJ(i - 1, j - 1) instanceof NemaFigure || engine.getTablaIJ(i - 1, j - 1) instanceof Kralj) 
					&& engine.getTablaIJ(i - 1, j - 1).getBoja() == Igrac.CRNI)
				dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 1, j - 1);
			
			if (i > 0 && j < 7 && !(engine.getTablaIJ(i - 1, j + 1) instanceof NemaFigure || engine.getTablaIJ(i - 1, j + 1) instanceof Kralj) 
					&& engine.getTablaIJ(i - 1, j + 1).getBoja() == Igrac.CRNI)
				dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 1, j + 1);
		}
		else
		{
			if (i < 7 && engine.getTablaIJ(i + 1, j) instanceof NemaFigure)
			{
				dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 1, j);
				if (i == 1 && engine.getTablaIJ(i + 2, j) instanceof NemaFigure)
					dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 2, j);					
			}
			
			if (i < 7 && j > 0 && !(engine.getTablaIJ(i + 1, j - 1) instanceof NemaFigure && engine.getTablaIJ(i + 1, j - 1) instanceof Kralj) 
					&& engine.getTablaIJ(i + 1, j - 1).getBoja() == Igrac.CRNI)
				dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 1, j - 1);
			
			if (i < 7 && j < 7 && !(engine.getTablaIJ(i + 1, j + 1) instanceof NemaFigure && engine.getTablaIJ(i + 1, j + 1) instanceof Kralj) 
					&& engine.getTablaIJ(i + 1, j + 1).getBoja() == Igrac.CRNI)
				dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 1, j + 1);
		}
		
		return dozvoljenaPolja;
	}

}
