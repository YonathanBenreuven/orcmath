package yonathanPlayground;

import guiTeacher.GUIApplication;

public class Testsuff extends GUIApplication {

	public Testsuff(int width, int height) {
		super(width, height);
		setVisible(true);
	}
 
	@Override
	public void initScreen() {
		yup sure = new yup(getWidth(), getHeight());
		setScreen(sure);	
	}
	
	public static void main(String[] args) {
		Testsuff gobots = new Testsuff(400, 400);
		Thread go = new Thread(gobots);
		go.start();
	}

	



}
