package jpu2016.dogfight.model;

public class Missile extends Mobile{

private final static int SPEED = 4;
private final static int WIDTH = 30;
private final static int HEIGHT = 10;
private final static int MAX_DISTANCE_TRAVELED = 1400;
private final static String IMAGE = "missile";
private int distanceTraveled = 0;

private final Direction direction;

public Missile(Direction direction, Position position) {
	super(direction, position,new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
	this.direction=direction;
}

public int getWidthWithADirection(Direction direction) {
	return 1;
}

public int getHeightWithADirection(Direction direction) {
return 1;
}

@Override
public void move() {
	if (distanceTraveled<MAX_DISTANCE_TRAVELED) {
		super.move();
		distanceTraveled=distanceTraveled+1;
	}
}

public boolean isWeapon() {
	return true;
}

}


