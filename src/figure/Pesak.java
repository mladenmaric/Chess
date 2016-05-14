package figure;
import ostalo.Engine;

public class Pesak extends Figura
{
	public Pesak(int i, int j, Igrac boja, Engine engine)
	{
		super(i, j, Figurica.PESAK, boja, engine);
	}

	public boolean pomeriFiguru(int x, int y)
	{
		Figura novaFigura = new NemaFigure(getI(), getJ(), engine);
		
		
		
		this.setI(x);
		this.setJ(y);
		engine.setTablaIJ(this); 
		engine.setTablaIJ(novaFigura); 
		
		return false;
	}

}
