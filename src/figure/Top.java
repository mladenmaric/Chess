package figure;
import glavni.Engine;

public class Top extends Figura
{
	
	public Top(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.TOP, boja, engine);
	}

	public Figura[] getDozvoljenaPolja()
	{
		Figura[] dozvoljenaPolja = new Figura[14];
		int popunjeno = 0;
		int i, j;
		
		i = getI();
		j = getJ();
		while (i > 0)
		{
			i--;
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
		while (j > 0)
		{
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
		while (i < 7)
		{
			i++;
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
		while (j < 7)
		{
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
