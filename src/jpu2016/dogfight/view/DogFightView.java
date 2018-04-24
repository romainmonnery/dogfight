package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.gameframe.GameFrame;
import sun.plugin2.message.Message;

public class DogFightView implements IViewSystem, Runnable{

	public DogFightView(IOrderPerformer orderPerformer, IDogFightModel dogFightModel, Observable observable) {
		GraphicsBuilder gBuilder = new GraphicsBuilder(dogFightModel);
		EventPerformer performer = new EventPerformer(orderPerformer);
		GameFrame frame = new GameFrame("titre", performer, gBuilder, observable);
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
