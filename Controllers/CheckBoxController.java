package Controllers;

import UIElements.CheckBox;

public class CheckBoxController extends Controller {
	private static CheckBoxController checkBoxControllerInstance;

	public static CheckBoxController getInstance() {
		if (checkBoxControllerInstance == null) {
			checkBoxControllerInstance = new CheckBoxController();
		}

		return checkBoxControllerInstance;
	}

	private CheckBoxController() {
	}

	public void check(String ID) {
		CheckBox checkBox = (CheckBox) UIElements.get(ID);
		checkBox.check();
	}

	public void unCheck(String ID) {
		CheckBox checkBox = (CheckBox) UIElements.get(ID);
		checkBox.unCheck();
	}

	public boolean getState(String ID) {
		CheckBox checkBox = (CheckBox) UIElements.get(ID);
		return checkBox.getState();
	}
}
