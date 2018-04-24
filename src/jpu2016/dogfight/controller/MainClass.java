package jpu2016.dogfight.controller;

import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.view.DogFightView;

public class MainClass {

	public static void main(String[] args) {
	
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogFightView dogfightView = new DogFightView(dogfightController, dogfightModel,
		dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
	}

}
