package jpu2016.dogfight.model;


public class Position {

private double x;
private double y;
private double maxX;
private double maxY;

public Position(double x, double y, double maxX, double maxY) {
	this.x=x;
	this.y=y;
	this.maxX=maxX;
	this.maxY=maxY;
}

public Position(Position position) {
	this(position.getX(), position.getY(), position.getMaxX(), position.getMaxY());
}

public double getX() {
	return x;
}

public double getMaxX() {
	return maxX;
}

public double getMaxY() {
	return maxY;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}


protected void setMaxX(double maxX) {
	this.maxX = maxX;
}


protected void setMaxY(double maxY) {
	this.maxY = maxY;
}

}
