package UIElements;

public class AndroidContainer extends Container {

	@Override
	public String draw() {
		StringBuilder output = new StringBuilder();
		output.append("Drawing Android Container with ID = " + this.Id + "\n");
		output.append("------------------------------------" + "\n");
		for (UIElement element : this.elements) {
			output.append(element.draw() + "\n");
		}
		output.append("------------------------------------" + "\n");
		return output.toString();
	}

}
