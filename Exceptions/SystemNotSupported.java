package Exceptions;
import Enums.SupportedSystems;

public class SystemNotSupported extends Exception {
	public SystemNotSupported(SupportedSystems system) {
		super(system.getName() + " is not Supported ");
	}
}
