package glavni;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import figure.Figura;
import figure.Figurica;

public class Gui extends JFrame
{
	private static final long serialVersionUID = 1L;
	private Engine engine = new Engine();
	private MyButton[][] polja; 
	private MyButton aktivnoDugme = null;
	
	public Gui()
	{
		initialize();
	}

	private void initialize()
	{
		setTable();
		setWindow();
		refreshGui();
		addListeners();
	}

	private void setTable()
	{
		JPanel centar = new JPanel(new GridLayout(8, 8));
		polja = new MyButton[8][8];
		
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
			{
				polja[i][j] = new MyButton(i, j);
				polja[i][j].setPreferredSize(new Dimension(80, 80));
				
				centar.add(polja[i][j]);
			}
		
		getContentPane().add(centar, BorderLayout.CENTER);
	}

	private void setWindow()
	{
		setBounds(300, 20, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}

	public void refreshGui()
	{
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
			{
				if (engine.getTablaIJ(i, j).getFigurica() != Figurica.NEPOZNATO)
					polja[i][j].setIcon(new ImageIcon(getClass().getResource("/" + engine.getTablaIJ(i, j).getBoja().toString() + 
							"_" + engine.getTablaIJ(i, j).getFigurica().toString() + ".png")));	
				else
					polja[i][j].setIcon(null);
				
				if ((i + j) % 2 == 0)
					polja[i][j].setBackground(Color.GRAY);
				else
					polja[i][j].setBackground(Color.WHITE);
			}
	}

	private void addListeners()
	{
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				polja[i][j].addActionListener(new MyButtonListener(this, engine));
	}

	public MyButton getAktivnoDugme()
	{
		return aktivnoDugme;
	}

	public void setAktivnoDugme(MyButton aktivnoDugme)
	{
		this.aktivnoDugme = aktivnoDugme;
	}
	
	public void setMogucaPolja(Figura f) throws Exception
	{
		Figura[] tren = f.getDozvoljenaPolja();
		
		if (tren[0] == null) 
			throw new Exception("Ne mozete pomeriti tog igraca!");
		
		for (int i = 0; i < tren.length && tren[i] != null; i++)
			polja[tren[i].getI()][tren[i].getJ()].setBackground(Color.CYAN);
	}
}
