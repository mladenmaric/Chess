package figure;
import glavni.Engine;

public class Kralj extends Figura
{
	
	public Kralj(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.KRALJ, boja, engine);
	}

	public Figura[] getDozvoljenaPolja()
	{
		Figura[] dozvoljenaPolja = new Figura[8];
		int popunjeno = 0;
		int i = getI(), j = getJ();
		
		if (i - 1 >= 0 && j - 1 >= 0 && (engine.getTablaIJ(i - 1, j - 1) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i - 1, j - 1).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 1, j - 1);
		
		if (j - 1 >= 0 && (engine.getTablaIJ(i, j - 1) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i, j - 1).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i, j - 1);
		
		if (i + 1 < 8 && j - 1 >= 0 && (engine.getTablaIJ(i + 1, j - 1) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i + 1, j - 1).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 1, j - 1);
		
		if (i + 1 < 8 && (engine.getTablaIJ(i + 1, j) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i + 1, j).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 1, j);
		
		//------
		
		if (i + 1 < 8 && j + 1 < 8 && (engine.getTablaIJ(i + 1, j + 1) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i + 1, j + 1).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 1, j + 1);
		
		if (j + 1 < 8 && (engine.getTablaIJ(i, j + 1) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i, j + 1).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i, j + 1);
		
		if (i - 1 >= 0 && j + 1 < 8 && (engine.getTablaIJ(i - 1, j + 1) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i - 1, j + 1).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 1, j + 1);
		
		if (i - 1 >= 0 && (engine.getTablaIJ(i - 1, j) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i - 1, j).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 1, j);
		
		return dozvoljenaPolja;
	}

}
