package figure;
import glavni.Engine;

public class Top extends Figura
{
	
	public Top(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.TOP, boja, engine);
	}

	public void pomeriFiguru(int x, int y) throws Exception
	{
		
	}

	public Figura[] getDozvoljenaPolja()
	{
		return null;
	}

}
