package UIElements;
import java.util.UUID;

public class JWTCheckBox extends CheckBox{
	@Override
	public String draw() {
		/* should be more Complex than just returning a string*/
		return "Drawing JWT CheckBox with ID = "+this.Id;
	}
	
	protected String generateID() {
		 return UUID.randomUUID().toString();
	 }
}
