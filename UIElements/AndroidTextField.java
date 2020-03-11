package UIElements;
public class AndroidTextField extends TextField {

	@Override
	public String draw() {
		return "Drawing Android Text Field with Text = "+this.text + " and ID = "+ this.getID();
	}

}
