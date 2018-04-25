package jpu2016.gameframe;

import jpu2016.dogfight.view.GraphicsBuilder;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {

	private IGraphicsBuilder gBuilder;



	public GamePanel(IGraphicsBuilder graphicBuilder) {
		this.gBuilder = graphicBuilder;
		this.setSize(500, 500);
		this.setVisible(true);

	}

	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
	}

	@Override
	public void paintComponent(Graphics graphic) {
		gBuilder.applyModelToGraphic(graphic, this);
	}


}

