import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Gui extends JFrame
{
	private static final long serialVersionUID = 1L;
	private Engine engine = new Engine();
	private MyButton[][] polja; 

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
				
				if ((i + j) % 2 == 0)
					polja[i][j].setBackground(Color.GRAY);
				else
					polja[i][j].setBackground(Color.WHITE);
				
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

	private void refreshGui()
	{
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				if (engine.getTablaIJ(i, j).getFigura() != Figurica.NEPOZNATO)
					polja[i][j].setIcon(new ImageIcon(getClass().getResource("images/" + engine.getTablaIJ(i, j).getBoja().toString() + 
							"_" + engine.getTablaIJ(i, j).getFigura().toString() + ".png")));		
	}

	private void addListeners()
	{
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
			{
				polja[i][j].addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						MyButton polje = (MyButton)e.getSource();
						
						if (engine.getTablaIJ(polje.getI(), polje.getJ()).getFigura() == Figurica.NEPOZNATO)
							JOptionPane.showMessageDialog(null, "Morate kliknuti na neku figuricu!");
						else
						{
							polje.setBackground(Color.ORANGE);
						}
						
					}
				});
			}
	}
	
	
}
