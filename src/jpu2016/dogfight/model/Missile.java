package jpu2016.dogfight.model;

public class Missile extends Mobile{

private final static int SPEED = 4;
private final static int WIDTH = 30;
private final static int HEIGHT = 10;
private final static int MAX_DISTANCE_TRAVELED = 1400;
private final static String IMAGE = "missile";
private final static int distanceTraveled = 0;

public Missile(Direction direction, Dimension dimension) {
	super(direction,new Position(0,0,WIDTH, HEIGHT), dimension, 4, "missile");
}

public int getWidthWithADirection(Direction direction) {
	return 1;
}

public int getHeightWithADirection(Direction direction) {
return 1;
}

public void move() {
	
}

public boolean isWeapon() {
	return true;
}

}
