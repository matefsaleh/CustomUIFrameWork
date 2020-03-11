package UIElements;

import Util.Util;

public abstract class TextField implements UIElement {

	protected String text;
	protected String Id;

	public TextField() {
		this.Id = Util.generateID();
	}

	public void setText(String Text) {
		this.text = Text;
	}

	public String getText() {
		return this.text;
	}

	@Override
	public String getID() {
		return this.Id;
	}

}
