package jpu2016.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class GameFrame extends JFrame implements KeyListener{

	private IEventPerformer performer;
	private Observable observer;


	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observer) {

		JFrame fenetre = new JFrame();
		fenetre.setTitle(title);
		fenetre.setSize(500,500);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}

		this.performer = performer;
		this.observer = observer;
		GamePanel Panel = new GamePanel(graphicBuilder);




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
