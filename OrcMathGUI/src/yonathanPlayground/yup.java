package yonathanPlayground;

import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class yup extends FullFunctionScreen {
		private TextArea text;
		private TextField message;
		private Button win;
		private Button lose;
		private Button addButton;
		boolean yes = true;
	public yup(int width, int height) {
		super(width, height);
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		win = new Button(300, 300, 50, 50, "win", new Action() {
		
			public void act() {
				if(yes) {
				System.out.println("win");
				message = new TextField(80, 80, 100, 100, "you win");
				viewObjects.add(message);
				yes=false;
				}
			}
		});
		
		viewObjects.add(win);

		
		lose = new Button(300, 200, 50, 50, "lose", new Action() {
			
			public void act() {
				if(yes) {
					System.out.println("lose");

				message = new TextField(80, 80, 100, 100, "you lose");
				viewObjects.add(message);
				yes=false;
				}
			}
		});
		
		viewObjects.add(lose);
		
		
	}

}
