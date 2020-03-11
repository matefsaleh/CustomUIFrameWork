package UIFrameWorkFactories;

import UIElements.AndroidCheckBox;
import UIElements.AndroidContainer;
import UIElements.AndroidTextField;
import UIElements.UIElement;

public class AndroidUIFrameWorkFactory extends UIFrameWorkFactory {

	@Override
	public UIElement createCheckBox() {
		return new AndroidCheckBox();
	}

	@Override
	public UIElement createTextField() {
		return new AndroidTextField();
	}

	@Override
	public UIElement createContainer() {
		return new AndroidContainer();
	}

}
