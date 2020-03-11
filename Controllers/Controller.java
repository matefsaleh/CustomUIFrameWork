package Controllers;

import java.util.HashMap;
import java.util.Map;

import UIElements.UIElement;

public class Controller {
	protected static Map<String, UIElement> UIElements;
	private static Controller ControllerInstance;

	public static Controller getInstance() {
		if (ControllerInstance == null) {
			ControllerInstance = new Controller();
			UIElements = new HashMap<String, UIElement>();
		}
		return ControllerInstance;
	}

	protected Controller() {
	}

	public void addElement(UIElement UIElement) {
		UIElements.put(UIElement.getID(), UIElement);
	}

	public void removeElement(String ID) {
		UIElements.remove(ID);
	}
}
