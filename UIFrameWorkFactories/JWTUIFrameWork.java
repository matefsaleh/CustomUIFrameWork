package UIFrameWorkFactories;

import UIElements.JWTCheckBox;
import UIElements.JWTContainer;
import UIElements.JWTTextField;
import UIElements.UIElement;

public class JWTUIFrameWork extends UIFrameWorkFactory {

	@Override
	public UIElement createCheckBox() {
		return new JWTCheckBox();
	}

	@Override
	public UIElement createTextField() {
		return new JWTTextField();
	}

	@Override
	public UIElement createContainer() {
		return new JWTContainer();
	}

}
