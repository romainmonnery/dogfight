package jpu2016.gameframe;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import static javafx.scene.input.KeyCode.getKeyCode;

public class GameFrame extends JFrame implements KeyListener{
    private KeyEvent key;
	private IEventPerformer perfomer;
	private Observable observer;


	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observer) {

		JFrame fenetre = new JFrame();
		fenetre.setTitle(title);
		fenetre.setSize(500, 500);
		fenetre.setVisible(true);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.perfomer = performer;
		this.observer = observer;
		this.setContentPane(new GamePanel (graphicBuilder));


	}



	
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		this.key = keyEvent;
		switch(key){
			case(getKeyCode(key) = KeyEvent.VK_Z):
				//direction UP
				break;
			case(key.getKeyCode() = keyEvent.VK_Q):
				//direction LEFT
				break;
			case (keyEvent.getKeyCode() = keyEvent.VK_S):
				//direction DOWN
				break;
			case (keyEvent.getKeyCode() = keyEvent.VK_D):
				//direction RIGHT
				break;


			case(keyEvent.getKeyCode() = KeyEvent.VK_UP):
				//direction UP
				break;
			case(keyEvent.getKeyCode() = keyEvent.VK_LEFT):
				//direction LEFT
				break;
			case (keyEvent.getKeyCode() = keyEvent.VK_DOWN):
				//direction DOWN
				break;
			case (keyEvent.getKeyCode() = keyEvent.VK_RIGHT):
				//direction RIGHT
				break;

		}

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
