package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener{

	private IEventPerformer performer;

	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observer) {

		JFrame fenetre = new JFrame();
		setTitle(title);
		setSize(500,500);
		setVisible(true);
		GamePanel Panel = new GamePanel(graphicBuilder);
		this.performer = performer;

	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
