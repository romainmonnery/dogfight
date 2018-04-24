package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.Dimension;
import jpu2016.dogfight.model.Direction;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.model.Position;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {

	private static int TIME_SLEEP = 30;
	private DogfightModel dogfightModel;

	public DogfightController(IDogfightModel dogfightModel) {

	}

	public void orderPerform(UserOrder userOrder) {

	}

	public void play() {

	}

	public void setViewSystem(IViewSystem viewSystem) {

	}

	private void launchMissile(int player) {
				
		if (player == 1) {
			
			Direction dirP = dogfightModel.getMobileByPlayer(1).getDirection();
			Position posP = dogfightModel.getMobileByPlayer(1).getPosition();
			Dimension dim = new Dimension(30, 10);
			Missile missile = new Missile(dirP, dim);
		} 
		else if (player == 2) {
			
			Direction dirP = dogfightModel.getMobileByPlayer(2).getDirection();
			Position posP = dogfightModel.getMobileByPlayer(2).getPosition();
			Dimension dim = new Dimension(30, 10);
			Missile missile = new Missile(dirP, dim);
		}	
	}

	private void gameLoop() {

	}

	public boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		if (((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() / weapon.getWidth()))
				&& ((weapon.getPosition().getX()
						/ weapon.getWidth()) <= ((mobile.getPosition().getX() + mobile.getWidth())
								/ weapon.getWidth()))) {
			if (((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY()
					/ weapon.getHeight()))
					&& ((weapon.getPosition().getY()
							/ weapon.getHeight()) <= ((mobile.getPosition().getY() + mobile.getHeight())
									/ weapon.getHeight()))) {
				return true;
			}
		}
		return false;
	}
	
	public void manageCollision(final IMobile mobile, final IMobile weapon) {
		if (this.isWeaponOnMobile(mobile, weapon) == true) {
			
		}
		else {
			
		}
	}
}
