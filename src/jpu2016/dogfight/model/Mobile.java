package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;


public class Mobile implements IMobile{

private int speed;
private Direction direction;
protected Position position;
protected Dimension dimension;
private Color color;
private Image image;
private DogfightModel dogfightModel;

public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
	this.setDirection(direction);
	this.setPosition(position);
	
}

public Direction getDirection() {
	return this.direction;
}

public void setDirection(Direction direction) {
	this.direction=direction;
}

public Position getPosition() {
	return this.position;
}

public Dimension getDimension() {
	return this.dimension;
}

public int getSpeed() {
	return 1;
}

public int getHeight() {
	return 1;
}

public int getWidth() {
	return 1;
}

public void move() {
	switch (direction) {
	case UP:
		this.moveUp();
		break;
	
	case DOWN:
		this.moveDown();
		break;
		
	case LEFT:
		this.moveLeft();
		break;
		
	case RIGHT:
		this.moveRight();
		break;
	}
}

public void placeInArea(IArea area) {
	
}

public boolean isPlayer(int player) {
	return true;
}

private void moveUp() {
	if(this.getPosition().getY()+1<this.getPosition().getMaxX()) {
		this.getPosition().setY (this.getPosition().getY()+1);
	}
}

private void moveRight() {
	if(this.getPosition().getX()+1<this.getPosition().getMaxX()) {
		this.getPosition().setX (this.getPosition().getX()+1);
	}
}

private void moveDown() {
	if(this.getPosition().getY()-1>this.getPosition().getMaxX()) {
		this.getPosition().setY(this.getPosition().getY()-1);
	}
}

private void moveLeft() {
	if(this.getPosition().getX()-1>this.getPosition().getMaxX()) {
		this.getPosition().setX(this.getPosition().getX()-1);
	}
}

public Color getColor() {
	return this.color;
}

public IDogfightModel getDogfightModel() {
	return this.dogfightModel;
}



public boolean hit() {
	return false;
}

public boolean isWeapon() {
	return false;
}

public Image getImage() {
	return this.image;
}

@Override
public void setDogfightModel(DogfightModel dogfightModel) {
	
}
}
