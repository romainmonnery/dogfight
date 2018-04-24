package jpu2016.dogfight.model;

public class Plane extends Mobile{

private final static int SPEED = 2;
private final static int WIDTH = 100;
private final static int HEIGHT = 30;
private static int player;

public Plane(int player, Direction direction, Position position, String image) {
	super(direction,new Position(0,0,WIDTH, HEIGHT), null, 2, null);
	this.player=player;
}
	
public boolean isPlayer(int player) {
	return true;
}

public boolean hit(){
	return true;
}

}
