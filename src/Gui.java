import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JButton[][] polja; 

	public Gui()
	{
		initialize();
	}

	private void initialize()
	{
		setTable();
		setWindow();
	}

	private void setTable()
	{
		JPanel centar = new JPanel(new GridLayout(8, 8));
		polja = new JButton[8][8];
		
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
			{
				polja[i][j] = new JButton();
				polja[i][j].setPreferredSize(new Dimension(80, 80));
				
				if (i + j % 2 == 0)
					polja[i][j].setBackground(Color.GRAY);
				else
					polja[i][j].setBackground(Color.WHITE);
				
				centar.add(polja[i][j]);
			}
		
		getContentPane().add(centar, BorderLayout.CENTER);
	}

	private void setWindow()
	{
		setBounds(300, 50, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	
}
