package UIFrameWorkFactories;

import UIElements.UIElement;

public abstract class UIFrameWorkFactory {
	public abstract UIElement createCheckBox();

	public abstract UIElement createTextField();

	public abstract UIElement createContainer();
}
