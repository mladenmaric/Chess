package ostalo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import figure.Figura;

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
			b.setBackground(Color.orange);
			gui.setPrviPutKliknuto(true);
			gui.setAktivnoDugme(b);
			
			tren = engine.getTablaIJ(b.getI(), b.getJ());
			gui.setMogucaPolja(tren);
		}
		else
		{
			Figura trenFigura = engine.getTablaIJ(gui.getAktivnoDugme().getI(), gui.getAktivnoDugme().getJ());
			
			try 
			{
				trenFigura.pomeriFiguru(b.getI(), b.getJ());
			} 
			catch (Exception e1) 
			{
				JOptionPane.showMessageDialog(null, e1.getMessage());
			}
			
			gui.setPrviPutKliknuto(false);
			gui.setAktivnoDugme(null);
			
			gui.refreshGui();			
		}
	}

}
