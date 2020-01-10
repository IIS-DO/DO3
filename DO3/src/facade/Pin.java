package facade;

public class Pin {
	private int pinNumber;

	public Pin(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public boolean isValid() {
		return (pinNumber == 1111) ? true : false;
	}

}
