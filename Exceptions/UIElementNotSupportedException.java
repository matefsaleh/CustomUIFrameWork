package Exceptions;
import Enums.UIElements;

public class UIElementNotSupportedException extends Exception {

	public UIElementNotSupportedException(UIElements element) {
		super( element.getName() + " is not Supported");
	}
}
