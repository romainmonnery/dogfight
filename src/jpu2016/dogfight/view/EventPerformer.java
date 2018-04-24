package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {

	private IOrderPerformer order;

	public EventPerformer(IOrderPerformer orderPerformer) {

		this.order = orderPerformer;

		switch(order) {
			case (haut):
				//changement de direction en angle droit
				break;
			case (bas):
				//changement de direction en angle droit
				break;
			case(dorite):
				//changement de direction en angle droit
				break;
			case (gauche):
				//changement de direction en angle droit
				break;
			case (missile):
				//changement de direction en angle droit
				break;
			default:
				// ne fait rien.
				break;

		}
	}
	
	public void eventPerform(KeyEvent keyCode) {
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {

	}
}
