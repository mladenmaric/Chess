package figure;
import glavni.Engine;

public class Kraljica extends Figura
{
	
	public Kraljica(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.KRALJICA, boja, engine);
	}

	public Figura[] getDozvoljenaPolja()
	{
		Figura[] dozvoljenaPolja = new Figura[27];
		int popunjeno = 0;
		
		Figura[] f1 = new Top(getI(), getJ(), getBoja(), engine).getDozvoljenaPolja();
		for (int i = 0 ; popunjeno < f1.length && f1[i] != null; i++, popunjeno++)
			dozvoljenaPolja[popunjeno] = f1[i];
		
		Figura[] f2 = new Lovac(getI(), getJ(), getBoja(), engine).getDozvoljenaPolja();
		for (int i = 0 ; popunjeno < f2.length && f2[i] != null; i++, popunjeno++)
			dozvoljenaPolja[popunjeno] = f2[i];
		
		return dozvoljenaPolja;
	}

}
