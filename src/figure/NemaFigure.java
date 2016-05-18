package figure;
import ostalo.Engine;

public class NemaFigure extends Figura
{
	
	public NemaFigure(int i, int j, Engine engine)
	{
		super(i, j, Figurica.NEPOZNATO, Igrac.NEPOZNATO, engine);
	}
	
	public void pomeriFiguru(int x, int y) {}

	public Figura[] getDozvoljenaPolja() { return null;	}

}
