package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer{

	public GamePanel(IGraphicsBuilder graphicBuilder) {
		JPanel panel = new JPanel();
		setSize(500,500);
		setVisible(true);



	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		//if arg0
		//if arg1
	}

	public void paintComponent(Graphics graphic) {
		
	}
	
}
