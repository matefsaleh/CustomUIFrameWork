package Enums;

public enum UIElements {
	CHECKBOX("checkbox"), TEXTFIELD("textField"), CONTAINER("container");

	private String name;

	private UIElements(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
