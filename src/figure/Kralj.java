package figure;
import ostalo.Engine;

public class Kralj extends Figura
{
	
	public Kralj(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.KRALJ, boja, engine);
	}

	public void pomeriFiguru(int x, int y) throws Exception
	{

	}

	@Override
	public Figura[] getDozvoljenaPolja()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
