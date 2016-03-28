package q4_1visibility;

public class SmartPhone extends MobilePhone {
	public SmartPhone(String brand) {
		super(brand);
	}

	@Override
	public void call(String number) {
		if(number.substring(0,2).equals("00")) {
			recordNumber(number);
			System.out.println("Calling <" + number + "> through the internet to save money");
		} else {
			super.call(number);
		}
	}
	public void browseWeb(String webURL) {
		System.out.println("The page " + webURL + " is loading...");
	}
	public String findPosition() {
		String GPSlocation = new String("-0.14862190490726235 , 51.50827347851798");
		System.out.println("Your GPS coordinates are " + GPSlocation);
		return GPSlocation;
	}
	
	public void playGame(String game) {
		System.out.println("Now playing " + game);
	}
}