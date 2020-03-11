package UIFrameWorkFactories;

import Controllers.Controller;
import Enums.SupportedSystems;
import Enums.UIElements;
import Exceptions.SystemNotSupported;
import Exceptions.UIElementNotSupportedException;
import UIElements.UIElement;

public class UIFrameWork {
	private UIFrameWorkFactory factory;

	public UIFrameWork(SupportedSystems system) throws SystemNotSupported {
		switch (system) {
		case ANDROID:
			this.factory = new AndroidUIFrameWorkFactory();
			break;
		case JWT:
			this.factory = new JWTUIFrameWork();
			break;
		default:
			throw new SystemNotSupported(system);
		}
	}

	public UIElement createElement(UIElements UIElement) throws UIElementNotSupportedException {
		UIElement UElement = null;
		switch (UIElement) {
		case CHECKBOX:
			UElement = this.factory.createCheckBox();
			break;
		case TEXTFIELD:
			UElement = this.factory.createTextField();
			break;
		case CONTAINER:
			UElement = this.factory.createContainer();
			break;
		default:
			throw new UIElementNotSupportedException(UIElement);
		}

		Controller.getInstance().addElement(UElement);
		return UElement;
	}

}
