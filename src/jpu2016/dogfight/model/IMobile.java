package jpu2016.dogfight.model;

import java.awt.Image;
import java.awt.Point;

public interface IMobile {

	public Direction getDirection();


	public void setDirection(Direction direction);

	public Point getPosition();

	public Dimension getDimension();

	public int getSpeed();

	public int getWidth();

	public int getHeight();

	public Image getImage();
	
	public void move();
	
	public void placeInArea(IArea area);

	public boolean isPlayer(int player);
	
	public DogfightModel setDogfightModel();

	public boolean hit();

	public boolean isWeapon();
}