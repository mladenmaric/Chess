
public class Engine
{
	private Polje[][] tabla;
	private Igrac naPotezu;
	
	public Engine()
	{
		initialize();
	}
	
	public void initialize()
	{
		naPotezu = Igrac.BELI;
		tabla = new Polje[8][8];
		
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
				tabla[i][j] = new Polje(i, j, Igrac.NEPOZNATO, Figurica.NEPOZNATO);	
	}

	private void setCrni()
	{
		tabla[0][0] = new Polje(0, 0, Igrac.CRNI, Figurica.TOP);
		tabla[0][7] = new Polje(0, 7, Igrac.CRNI, Figurica.TOP);
		
		tabla[0][1] = new Polje(0, 1, Igrac.CRNI, Figurica.KONJ);
		tabla[0][6] = new Polje(0, 6, Igrac.CRNI, Figurica.KONJ);
		
		tabla[0][2] = new Polje(0, 2, Igrac.CRNI, Figurica.LOVAC);
		tabla[0][5] = new Polje(0, 5, Igrac.CRNI, Figurica.LOVAC);
		
		tabla[0][3] = new Polje(0, 3, Igrac.CRNI, Figurica.KRALJ);
		tabla[0][4] = new Polje(0, 4, Igrac.CRNI, Figurica.KRALJICA);
		
		for (int j = 0; j < 8; j++)
			tabla[1][j] = new Polje(1, j, Igrac.CRNI, Figurica.PESAK);
	}

	private void setBeli()
	{
		tabla[7][0] = new Polje(7, 0, Igrac.BELI, Figurica.TOP);
		tabla[7][7] = new Polje(7, 7, Igrac.BELI, Figurica.TOP);
		
		tabla[7][1] = new Polje(7, 1, Igrac.BELI, Figurica.KONJ);
		tabla[7][6] = new Polje(7, 6, Igrac.BELI, Figurica.KONJ);
		
		tabla[7][2] = new Polje(7, 2, Igrac.BELI, Figurica.LOVAC);
		tabla[7][5] = new Polje(7, 5, Igrac.BELI, Figurica.LOVAC);
		
		tabla[7][3] = new Polje(7, 3, Igrac.BELI, Figurica.KRALJ);
		tabla[7][4] = new Polje(7, 4, Igrac.BELI, Figurica.KRALJICA);
		
		for (int j = 0; j < 8; j++)
			tabla[6][j] = new Polje(6, j, Igrac.BELI, Figurica.PESAK);
	}
	
	public Igrac getNaPotezu()
	{
		return naPotezu;
	}

	public Polje getTablaIJ(int i, int j)
	{
		return tabla[i][j];
	}
}
