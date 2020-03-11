package Enums;

public enum SupportedSystems {
	ANDROID("android"), JWT("jwt");

	private String name;

	private SupportedSystems(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
