package ostalo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		if (gui.isPrviPutKliknuto() == false)
		{
			b.setBackground(Color.orange);
			gui.setPrviPutKliknuto(true);
			gui.setAktivnoDugme(b);
		}
		else
		{
			Figura trenFigura = engine.getTablaIJ(gui.getAktivnoDugme().getI(), gui.getAktivnoDugme().getJ());
			trenFigura.pomeriFiguru(b.getI(), b.getJ());
			
			gui.setPrviPutKliknuto(false);
			gui.setAktivnoDugme(null);
			
			gui.refreshGui();			
		}
	}

}
