package q1extension;

public class SmartPhone extends MobilePhone {

	public void browseWeb(String webURL) {
		System.out.println("The page " + webURL + " is loading...");
	}
	public String findPosition() {
		String GPSlocation = new String("-0.14862190490726235 , 51.50827347851798");
		System.out.println("Your GPS coordinates are " + GPSlocation);
		return GPSlocation;
	}
}