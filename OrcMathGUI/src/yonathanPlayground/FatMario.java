package yonathanPlayground;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class FatMario extends AnimatedComponent {

	public FatMario() {
		super(40, 40, 96,300);
		addSequence("resources/sprokezero.png",150,515,1,33,90,30);
		Thread animation = new Thread(this);
		animation.start();
		update();
	}

	
	public void update(Graphics2D g) {
		super.update(g);
		

	}

}
