package jpu2016.dogfight.model;

import java.awt.Image;

public class Sky implements IArea{

	private Dimension dimension;
	private Image image;
	
	public Sky(Dimension dimension) {
		this.dimension=dimension;
	}
	
	public Dimension getDimension() {
		return this.dimension;
	}

	public Image getImage() {
		return this.image;
	}	
	
}
