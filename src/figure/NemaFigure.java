package figure;
import glavni.Engine;

public class NemaFigure extends Figura
{
	
	public NemaFigure(int i, int j, Engine engine)
	{
		super(i, j, Figurica.NEPOZNATO, Igrac.NEPOZNATO, engine);
	}

	public Figura[] getDozvoljenaPolja() 
	{ 
		Figura[] f = new Figura[1];
		return f;	
	}

}
