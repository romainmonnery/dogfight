package jpu2016.gameframe;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import static javafx.scene.input.KeyCode.getKeyCode;

public class GameFrame extends JFrame implements KeyListener{

	private IEventPerformer perfomer;
	private Observable observable;
	private GamePanel gamePanel;


	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {

		this.setTitle(title);
		this.setLocationRelativeTo(null);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.perfomer = performer;
		this.observable = observable;
		this.gamePanel = new GamePanel(graphicBuilder);
		this.setContentPane(gamePanel);

		this.setVisible(true);
	}



	
	@Override
	public void keyPressed(KeyEvent keyEvent) {

		/*switch(keyEvent){
			case(keyEvent.getKeyCode() = KeyEvent.VK_Z):
				//direction UP
				break;
			case(keyEvent.getKeyCode() = keyEvent.VK_Q):
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
			defaut:
			break;

		}
*/
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
