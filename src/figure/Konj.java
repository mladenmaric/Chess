package figure;
import ostalo.Engine;

public class Konj extends Figura
{
	
	public Konj(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.KONJ, boja, engine);
	}

	public void pomeriFiguru(int x, int y) throws Exception
	{
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public Figura[] getDozvoljenaPolja()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
