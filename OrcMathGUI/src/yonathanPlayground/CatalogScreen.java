package yonathanPlayground;

import java.util.List;

import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {
 
	private TextField descriptionField;
	public CatalogScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		descriptionField = new TextField(40, 40, 200, 30, "enter text","card name");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(40, 40, 200, 30, "enter text","card effect");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(40, 40, 200, 30, "enter text","card cost");
		viewObjects.add(descriptionField);
	}

	public static void main(String[] args) {
	

	}

}
