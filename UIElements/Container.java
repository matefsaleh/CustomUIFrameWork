package UIElements;

import java.util.ArrayList;
import java.util.List;

import Util.Util;

public abstract class Container implements UIElement {
	protected String Id;

	protected List<UIElement> elements;

	public Container() {
		this.Id = Util.generateID();
		elements = new ArrayList<UIElement>();
	}

	@Override
	public String getID() {
		return this.Id;
	}

	public void addElement(UIElement element) {
		elements.add(element);
	}

	public void removeElement(UIElement element) {
		elements.remove(element);
	}

}
