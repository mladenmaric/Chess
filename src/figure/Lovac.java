package figure;
import glavni.Engine;

public class Lovac extends Figura
{
	
	public Lovac(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.LOVAC, boja, engine);
	}

	public Figura[] getDozvoljenaPolja()
	{
		Figura[] dozvoljenaPolja = new Figura[13];
		int popunjeno = 0;
		int i, j;
		
		i = getI();
		j = getJ(); 
		while (i > 0 && j > 0)
		{
			i--;
			j--;
			if (engine.getTablaIJ(i, j) instanceof NemaFigure)
				dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i, j);
			else
			{
				if (engine.getTablaIJ(i, j).getBoja() != this.getBoja())
					dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i, j);
					
				break;
			}	
		}
		
		i = getI();
		j = getJ();
		while (i > 0 && j < 7)
		{
			i--;
			j++;
			if (engine.getTablaIJ(i, j) instanceof NemaFigure)
				dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i, j);
			else
			{
				if (engine.getTablaIJ(i, j).getBoja() != this.getBoja())
					dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i, j);
					
				break;
			}	
		}
		
		i = getI();
		j = getJ();
		while (i < 7 && j > 0)
		{
			i++;
			j--;
			if (engine.getTablaIJ(i, j) instanceof NemaFigure)
				dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i, j);
			else
			{
				if (engine.getTablaIJ(i, j).getBoja() != this.getBoja())
					dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i, j);
					
				break;
			}	
		}
		
		i = getI();
		j = getJ();
		while (i < 7 && j < 7)
		{
			i++;
			j++;
			if (engine.getTablaIJ(i, j) instanceof NemaFigure)
				dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i, j);
			else
			{
				if (engine.getTablaIJ(i, j).getBoja() != this.getBoja())
					dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i, j);
					
				break;
			}	
		}		
		
		return dozvoljenaPolja;
	}

}
