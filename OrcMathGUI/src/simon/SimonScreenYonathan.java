package simon;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;


public class SimonScreenYonathan extends ClickableScreen implements Runnable {

	protected static Object card;
	protected static Object inside;
	private TextLabel textLabel;
	private ButtonInterfaceYonathan[] buttonInterface;
	private ProgressInterfaceYonathan progressInterface;
	private ArrayList<MoveInterfaceYonathan> moveInterface;
	int roundNumber;
	boolean acceptingInput;
	int sequenceIndex;
	int lastSelectedButton;

	public SimonScreenYonathan(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		viewObjects.add(new Graphic(0, 0, getWidth(),getHeight(),"resources/winterscape.jpg"));
		
		
		//viewObjects.add();
		
	}

}
