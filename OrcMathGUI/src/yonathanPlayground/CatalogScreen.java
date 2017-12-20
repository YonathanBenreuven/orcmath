package yonathanPlayground;

import java.io.File;
import java.util.List;

import javax.swing.JFrame;

import guiTeacher.components.*;
import guiTeacher.interfaces.FileRequester;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen implements FileRequester {
	private TextArea text;
	private TextField descriptionField;
	private Button addButton;
	private Button saveButton;
	private Button deleteButton;
	private FileOpenButton openFile;
	private CatalogMaker cardMaker;
	public CatalogScreen(int width, int height) {
		super(width, height);
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButton = new Button(300,300,50,50,"add",new Action() {
			
			@Override
			public void act() {
				addClicked();
				
			}
		});
		viewObjects.add(addButton);
		saveButton = new Button(300,360,50,50,"save",new Action() {
			
			@Override
			public void act() {
				addClicked();
				
			}
		});
		viewObjects.add(saveButton);
		deleteButton = new Button(300,420,50,50,"delete",new Action() {
			
			@Override
			public void act() {
				addClicked();
				
			}
		});
		viewObjects.add(deleteButton);
		openFile = new FileOpenButton(300,480,50,50,null,this);
		viewObjects.add(openFile);
		text = new TextArea(80,80,100,100,"This is where text goes");
		viewObjects.add(text);
		descriptionField = new TextField(40, 40, 100, 40, "enter text","card name");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(140, 140, 200, 40, "enter text","card effect");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(240, 240, 200, 40, "enter text","card cost");
		viewObjects.add(descriptionField);
	}

	protected void addClicked() {
		text.setText("add button clicked");
		
	}

	public static void main(String[] args) {
	

	}

	@Override
	public void setFile(File f) {
		
		
	}

	@Override
	public JFrame getWindow() {
		
		return null;
	}

}
