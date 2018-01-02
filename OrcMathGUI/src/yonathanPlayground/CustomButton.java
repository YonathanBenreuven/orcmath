package yonathanPlayground;
import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.Button;
public class CustomButton extends Button {
	private String string1;
	private String string2;
	private Color color;
	
	public CustomButton(int x,int y) {
		super(x,y,200,100,"",null);
	}
	
	public void drawButton(Graphics2D g, boolean hover) {
		
		g.setColor(Color.GREEN);	
		g.drawString("ola", 25, 25);
		g.drawString("oal", 50, 50);
		g.setColor(color);
		g.drawRect(15,15, 10, 10);
		g.fillRect(15, 15, 10, 10);
		
	}
	void updateString1(String string) {
		
	}

	void updateString2(String string) {
		
	}

	void setIconColor(Color color) {
		
	}
	
	public static void main(String[] args) {

	}

}
