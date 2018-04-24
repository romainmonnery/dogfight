package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel{

	private IArea area;
	private ArrayList<IMobile> mobile;
	private IMobile iMobile;
	
	public DogfightModel() {
		
	}
	
	public IArea getArea() {
		return this.area;
	}
	
	public void getbuildArea(Dimension dimension) {
		
	}
	
	public void addMobile(IMobile Mobile) {
		
	}
	
	public void removeMobile(IMobile Mobile) {
		
	}
	
	public ArrayList<IMobile> getMobiles() {
		return this.mobile;
	}
	
	public IMobile getMobileByPlayer(int player) {
		return iMobile;
	}
	
	public void setMobilesHavesMoved() {
		
	}
	
}
