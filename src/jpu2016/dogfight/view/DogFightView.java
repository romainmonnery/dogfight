package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;
//import sun.plugin2.message.Message;

public class DogFightView implements IViewSystem, Runnable{

	public DogFightView(IOrderPerformer orderPerformer, IDogfightModel dogFightModel, Observable observable) {
		/*GraphicsBuilder gBuilder = new GraphicsBuilder(dogFightModel);
		EventPerformer performer = new EventPerformer(orderPerformer);
<<<<<<< HEAD
		GameFrame frame = new GameFrame("titre", performer, gBuilder, observable);
=======
		GameFrame frame = new GameFrame("fenetre de jeux", performer, gBuilder, observable);*/
>>>>>>> bb8f62eb2e4a32bd5473629324bffb054933370a
	}
	
	@Override
	public void displayMessage(String message) {

	}

	@Override
	public void closeAll() {
		
	}

	@Override
	public void run() {
		
	}

}
