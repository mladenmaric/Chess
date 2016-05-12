
public class Polje
{
	private int i;
	private int j;
	private Igrac boja;
	private Figurica figura;
	
	public Polje(int i, int j, Igrac boja, Figurica figura)
	{
		super();
		this.i = i;
		this.j = j;
		this.boja = boja;
		this.figura = figura;
	}

	public int getI()
	{
		return i;
	}

	public void setI(int i)
	{
		this.i = i;
	}

	public int getJ()
	{
		return j;
	}

	public void setJ(int j)
	{
		this.j = j;
	}

	public Igrac getBoja()
	{
		return boja;
	}

	public void setBoja(Igrac boja)
	{
		this.boja = boja;
	}

	public Figurica getFigura()
	{
		return figura;
	}

	public void setFigura(Figurica figura)
	{
		this.figura = figura;
	}
	
	
}
