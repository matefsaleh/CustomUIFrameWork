package UIElements;

import Util.Util;

public abstract class CheckBox implements UIElement {
	protected boolean state;
	protected String Id;

	public CheckBox() {
		this.Id = Util.generateID();
	}

	public void check() {
		this.state = true;
	}

	public void unCheck() {
		this.state = false;
	}

	public boolean getState() {
		return this.state;
	}

	@Override
	public String getID() {
		return this.Id;
	}

	public void attachCheckBoxController() {

	}

}
