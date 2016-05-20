package glavni;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import figure.Figura;
import figure.NemaFigure;

public class MyButtonListener implements ActionListener
{
	private Gui gui;
	private Engine engine;	
	
	public MyButtonListener(Gui gui, Engine engine)
	{
		super();
		this.gui = gui;
		this.engine = engine;
	}

	public void actionPerformed(ActionEvent e)
	{
		MyButton b = (MyButton)e.getSource();
		Figura tren;
		
		if (gui.isPrviPutKliknuto() == false)
		{			
			tren = engine.getTablaIJ(b.getI(), b.getJ());
			
			if (tren instanceof NemaFigure)
				JOptionPane.showMessageDialog(null,	"Morate kliknuti na figuru!");
			else
			{
				if (engine.getNaPotezu() == tren.getBoja())
				{		
					try
					{
						gui.setMogucaPolja(tren);
						
						b.setBackground(Color.orange);
						gui.setPrviPutKliknuto(true);
						gui.setAktivnoDugme(b);
					}
					catch (Exception e1)
					{
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				}
				else
					JOptionPane.showMessageDialog(null,	"Na potezu je: " + engine.getNaPotezu().toString() + " igrac!");
			}
			
		}
		else
		{
			Figura trenFigura = engine.getTablaIJ(gui.getAktivnoDugme().getI(), gui.getAktivnoDugme().getJ());
			
			if (b == gui.getAktivnoDugme())
			{
				gui.setPrviPutKliknuto(false);
				gui.setAktivnoDugme(null);
				gui.refreshGui();
			}
			else
			{
				try 
				{
					trenFigura.pomeriFiguru(b.getI(), b.getJ());
					
					gui.setPrviPutKliknuto(false);
					gui.setAktivnoDugme(null);
					engine.setNaPotezu();
					
					gui.refreshGui();	
				} 
				catch (Exception e1) 
				{
					JOptionPane.showMessageDialog(null, e1.getMessage());
				}
			}
					
		}
	}

}
