package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;
import sun.plugin2.message.Message;

public class DogFightView implements IViewSystem, Runnable {

	public DogFightView(IOrderPerformer orderPerformer, IDogfightModel dogFightModel, Observable observable) {
		GraphicsBuilder gBuilder = new GraphicsBuilder(dogFightModel);
		EventPerformer performer = new EventPerformer(orderPerformer);

		GameFrame frame = new GameFrame("titre", performer, gBuilder, observable);

	}

	@Override
	public void run() {

	}

	@Override
	public void displayMessage(String message) {

	}

	@Override
	public void closeAll() {

	}
}

// de quoi draw un élément dans le panel en fonction de ses images.
/**  trucimage( Graphics g){
 *
 * try {
 *     Image img = ImageIO.read(new File("images.jpg"));
 *     g.drawImage(img, 0, 0, this);
 *
 * }
 *  catch (IOException e){
 *      e.printStrackTrace();
 *  }
 * }
 *
 */
