package Controllers;

import UIElements.Container;
import UIElements.UIElement;

public class ContainerController extends Controller{
	private static ContainerController containerControllerInstance;

	public static ContainerController getInstance() {
		if (containerControllerInstance == null) {
			containerControllerInstance = new ContainerController();
		}

		return containerControllerInstance;
	}

	private ContainerController() {
		super();
	}

	public void addUIElement(String ID, UIElement element) {
		Container container = (Container) UIElements.get(ID);
		container.addElement(element);
	}

	public void removeUIElement(String ID, UIElement element) {
		Container container = (Container) UIElements.get(ID);
		container.removeElement(element);
	}
}
