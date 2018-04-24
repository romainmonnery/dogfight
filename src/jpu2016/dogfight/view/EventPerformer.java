package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.Order;
import jpu2016.dogfight.controller.UserOrder;
import jpu2016.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer {

	private Order order;
	private UserOrder keyCodeOrder;

	public EventPerformer(IOrderPerformer orderPerformer) {

		this.order = orderPerformer;

		switch(order) {
			case UP:
				//changement de direction en angle droit
				break;
			case DOWN:
				//changement de direction en angle droit
				break;
			case RIGHT:
				//changement de direction en angle droit
				break;
			case LEFT:
				//changement de direction en angle droit
				break;
			case SHOOT:
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
		return keyCodeOrder;
	}
}
