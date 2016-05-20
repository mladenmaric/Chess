package figure;
import glavni.Engine;

public class Konj extends Figura
{
	
	public Konj(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.KONJ, boja, engine);
	}

	public Figura[] getDozvoljenaPolja()
	{
		Figura[] dozvoljenaPolja = new Figura[8];
		int popunjeno = 0;
		int i = getI(), j = getJ();
		
		if (i - 2 >= 0 && j - 1 >= 0 && (engine.getTablaIJ(i - 2, j - 1) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i - 2, j - 1).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 2, j - 1);
		
		if (i - 1 >= 0 && j - 2 >= 0 && (engine.getTablaIJ(i - 1, j - 2) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i - 1, j - 2).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 1, j - 2);
		
		if (i + 1 < 8 && j - 2 >= 0 && (engine.getTablaIJ(i + 1, j - 2) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i + 1, j - 2).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 1, j - 2);
		
		if (i + 2 < 8 && j - 1 >= 0 && (engine.getTablaIJ(i + 2, j - 1) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i + 2, j - 1).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 2, j - 1);
		
		// ------
		
		if (i - 2 >= 0 && j + 1 < 8 && (engine.getTablaIJ(i - 2, j + 1) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i - 2, j + 1).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 2, j + 1);
		
		if (i - 1 >= 0 && j + 2 < 8 && (engine.getTablaIJ(i - 1, j + 2) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i - 1, j + 2).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i - 1, j + 2);
		
		if (i + 1 < 8 && j + 2 < 8 && (engine.getTablaIJ(i + 1, j + 2) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i + 1, j + 2).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 1, j + 2);
		
		if (i + 2 < 8 && j + 1 < 8 && (engine.getTablaIJ(i + 2, j + 1) instanceof NemaFigure 
				|| this.getBoja() != engine.getTablaIJ(i + 2, j + 1).getBoja()))
			dozvoljenaPolja[popunjeno++] = engine.getTablaIJ(i + 2, j + 1);
		
		return dozvoljenaPolja;
	}

}
