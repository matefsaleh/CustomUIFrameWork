package Controllers;

import UIElements.TextField;

public class TextFieldController extends Controller {
	private static TextFieldController textFieldControllerInstance;

	public static TextFieldController getInstance() {
		if (textFieldControllerInstance == null) {
			textFieldControllerInstance = new TextFieldController();
		}

		return textFieldControllerInstance;
	}

	private TextFieldController() {
		super();
	}

	public void setText(String ID, String value) {
		TextField textFiled = (TextField) UIElements.get(ID);
		textFiled.setText(value);
	}

	public String getText(String ID) {
		TextField textFiled = (TextField) UIElements.get(ID);
		return textFiled.getText();
	}
}
