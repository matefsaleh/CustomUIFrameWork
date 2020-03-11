import Controllers.CheckBoxController;
import Controllers.ContainerController;
import Enums.SupportedSystems;
import Enums.UIElements;
import Exceptions.SystemNotSupported;
import Exceptions.UIElementNotSupportedException;
import UIElements.UIElement;
import UIFrameWorkFactories.UIFrameWork;

public class Main {

	public static void main(String[] args) throws UIElementNotSupportedException, SystemNotSupported {
		UIFrameWork androidUIFrameWork = new UIFrameWork(SupportedSystems.ANDROID);
		UIElement androidContainer = androidUIFrameWork.createElement(UIElements.CONTAINER);
		UIElement androidChecbox = androidUIFrameWork.createElement(UIElements.CHECKBOX);
		UIElement androidtextField = androidUIFrameWork.createElement(UIElements.TEXTFIELD);

		// simulating adding elements to the container (drag and drop) and drawing it
		ContainerController.getInstance().addUIElement(androidContainer.getID(), androidChecbox);
		ContainerController.getInstance().addUIElement(androidContainer.getID(), androidtextField);
		System.out.println(androidContainer.draw());

		// simulating checking/unchecking a check box
		CheckBoxController.getInstance().check(androidChecbox.getID());
		System.out.println(CheckBoxController.getInstance().getState(androidChecbox.getID()));

		CheckBoxController.getInstance().unCheck(androidChecbox.getID());
		System.out.println(CheckBoxController.getInstance().getState(androidChecbox.getID()));
	}

}
