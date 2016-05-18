package figure;
import glavni.Engine;

public class Kraljica extends Figura
{
	
	public Kraljica(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.KRALJICA, boja, engine);
	}

	public void pomeriFiguru(int x, int y) throws Exception
	{
		
	}

	public Figura[] getDozvoljenaPolja()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
