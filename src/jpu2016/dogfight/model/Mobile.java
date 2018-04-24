package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;

public class Mobile implements IMobile{

private int speed;
private Direction direction;
protected Point position;
protected Dimension dimension;
private Color color;
private Image image;
private DogfightModel dogfightModel;

public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image) {
	
}

public Direction getDirection() {
	return this.direction;
}

public void setDirection(Direction direction) {
	this.direction=direction;
}

public Point getPosition() {
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
	
}

public void placeInArea(IArea area) {
	
}

public boolean isPlayer(int player) {
	return true;
}

private void moveUp() {
	
}

private void moveRight() {
	
}

private void moveDown() {
	
}

private void moveLeft() {
	
}

public Color getColor() {
	return this.color;
}

public IDogfightModel getDogfightModel() {
	return this.dogfightModel;
}



public boolean hit() {
	return true;
}

public boolean isWeapon() {
	return true;
}

public Image getImage() {
	return this.image;
}

@Override
public void setDogfightModel(DogfightModel dogfightModel) {
	
}
}
