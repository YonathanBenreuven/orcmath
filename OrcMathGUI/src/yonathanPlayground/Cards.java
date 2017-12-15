package yonathanPlayground;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import guiTeacher.components.Component;
 
public class Cards extends Component {
	String name;
	String effect;
	int cost;
	
	public Cards(String name,String effect,int cost) {
		super(40, 40, 40,90);
		this.name = name;
		this.effect = effect;
		this.cost = cost;
		
		update();
	}
	public String toString() {
		return name + " ,  " + effect + " , "+ cost + " , ";
	}
	
	public void update(Graphics2D g) {
	
		

	}

}
