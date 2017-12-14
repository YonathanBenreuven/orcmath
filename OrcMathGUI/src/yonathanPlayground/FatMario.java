package yonathanPlayground;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class FatMario extends Component {

	public FatMario() {
		super(40, 40, 100,100);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Graphics2D g) {
		g.setColor(Color.RED);
		g.drawRect(0, 0, getWidth(), getHeight());

	}

}
