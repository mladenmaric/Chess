package glavni;
import figure.Figura;
import figure.Igrac;
import figure.Konj;
import figure.Kralj;
import figure.Kraljica;
import figure.Lovac;
import figure.NemaFigure;
import figure.Pesak;
import figure.Top;


public class Engine
{
	private Figura[][] tabla;
	private Igrac naPotezu;
	private int brojOdigranihPotezaBeli;
	private int brojOdigranihPotezaCrni;
	private Figura[] pojedeniBeli;
	private Figura[] pojedeniCrni;
	
	public Engine()
	{
		initialize();
	}
	
	public void initialize()
	{
		setBrojOdigranihPotezaBeli(0);
		setBrojOdigranihPotezaBeli(0);
		setNaPotezu(Igrac.BELI);
		
		tabla = new Figura[8][8];
		pojedeniBeli = new Figura[8];
		pojedeniCrni = new Figura[8];
		
		setStart();
	}

	private void setStart()
	{
		setBeli();
		setCrni();
		setPrazno();
	}

	private void setPrazno()
	{
		for (int i = 2; i < 6; i++)
			for (int j = 0; j < 8; j++)
				tabla[i][j] = new NemaFigure(i, j, this);	
	}

	private void setCrni()
	{
		tabla[0][0] = new Top(0, 0, Igrac.CRNI, this);
		tabla[0][7] = new Top(0, 7, Igrac.CRNI, this);
		
		tabla[0][1] = new Konj(0, 1, Igrac.CRNI, this);
		tabla[0][6] = new Konj(0, 6, Igrac.CRNI, this);
		
		tabla[0][2] = new Lovac(0, 2, Igrac.CRNI, this);
		tabla[0][5] = new Lovac(0, 5, Igrac.CRNI, this);
		
		tabla[0][3] = new Kralj(0, 3, Igrac.CRNI, this);
		tabla[0][4] = new Kraljica(0, 4, Igrac.CRNI, this);
		
		for (int j = 0; j < 8; j++)
			tabla[1][j] = new Pesak(1, j, Igrac.CRNI, this);
	}

	private void setBeli()
	{
		tabla[7][0] = new Top(7, 0, Igrac.BELI, this);
		tabla[7][7] = new Top(7, 7, Igrac.BELI, this);
		
		tabla[7][1] = new Konj(7, 1, Igrac.BELI, this);
		tabla[7][6] = new Konj(7, 6, Igrac.BELI, this);
		
		tabla[7][2] = new Lovac(7, 2, Igrac.BELI, this);
		tabla[7][5] = new Lovac(7, 5, Igrac.BELI, this);
		
		tabla[7][3] = new Kralj(7, 3, Igrac.BELI, this);
		tabla[7][4] = new Kraljica(7, 4, Igrac.BELI, this);
		
		for (int j = 0; j < 8; j++)
			tabla[6][j] = new Pesak(6, j, Igrac.BELI, this);
	}
	
	public Igrac getNaPotezu()
	{
		return naPotezu;
	}

	public void setNaPotezu(Igrac naPotezu)
	{
		this.naPotezu = naPotezu;
	}
	
	public Figura getTablaIJ(int i, int j)
	{
		return tabla[i][j];
	}
	
	public void setTablaIJ(Figura f)
	{
		tabla[f.getI()][f.getJ()] = f;
	}

	public int getBrojOdigranihPotezaBeli()
	{
		return brojOdigranihPotezaBeli;
	}

	public void setBrojOdigranihPotezaBeli(int brojOdigranihPotezaBeli)
	{
		this.brojOdigranihPotezaBeli = brojOdigranihPotezaBeli;
	}

	public int getBrojOdigranihPotezaCrni()
	{
		return brojOdigranihPotezaCrni;
	}

	public void setBrojOdigranihPotezaCrni(int brojOdigranihPotezaCrni)
	{
		this.brojOdigranihPotezaCrni = brojOdigranihPotezaCrni;
	}

	
	public Figura[] getPojedeniCrni()
	{
		return pojedeniCrni;
	}

	
	public void setPojedeniCrni(Figura pojedeniCrni, int index)
	{
		this.pojedeniCrni[index] = pojedeniCrni;
	}

	
	public Figura[] getPojedeniBeli()
	{
		return pojedeniBeli;
	}

	
	public void setPojedeniBeli(Figura pojedeniBeli, int index)
	{
		this.pojedeniBeli[index] = pojedeniBeli;
	}
	
	
}
