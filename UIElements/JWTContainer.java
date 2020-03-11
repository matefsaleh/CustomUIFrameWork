package UIElements;

public class JWTContainer extends Container{

	@Override
	public String draw() {
		StringBuilder output = new StringBuilder();
		output.append("/////////////////////////////////////////////////" + "\n");
		output.append("Drawing JWT Container with ID = " + this.Id + "\n");
		for (UIElement element : this.elements) {
			output.append(element.draw() + "\n");
		}
		output.append("/////////////////////////////////////////////////" + "\n");

		return output.toString();	
	}
}
