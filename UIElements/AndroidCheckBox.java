package UIElements;
public class AndroidCheckBox extends CheckBox{
	@Override
	public String draw() {
		/* should be more Complex than just returning a string*/
		return "Drawing Android CheckBox with ID = "+this.Id;
	}

}
