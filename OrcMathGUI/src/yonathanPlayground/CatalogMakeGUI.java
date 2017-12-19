package yonathanPlayground;

import guiPlayer.Sampler;
import guiTeacher.GUIApplication;
import guiTeacher.userInterfaces.Screen;

public class CatalogMakeGUI extends GUIApplication {

	public CatalogMakeGUI(int width, int height) {
		super(width, height);
		setVisible(true);
	}

	@Override
	public void initScreen() {
		CatalogScreen screen = new CatalogScreen(getWidth(), getHeight());
		setScreen(screen);
	}

	public static void main(String[] args) {
		CatalogMakeGUI sample = new CatalogMakeGUI(800, 550);
		Thread go = new Thread(sample);
		go.start();

	}

}
