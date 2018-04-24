package jpu2016.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {

	private IGraphicsBuilder gBuilder;



	public GamePanel(IGraphicsBuilder graphicBuilder) {
		this.gBuilder = graphicBuilder;
		JPanel panel = new JPanel();
		panel.setSize(500, 500);
		panel.setVisible(true);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		//if arg0
		//if arg1
	}

	public void paintComponent(Graphics graphic) {

	}


}

