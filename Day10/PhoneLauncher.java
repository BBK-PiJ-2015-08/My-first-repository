public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
		SmartPhone iPhone = new SmartPhone();
		iPhone.ringAlarm("morning");
		iPhone.findPosition();
		iPhone.browseWeb("http://www.google.com");
	// your code creating and using SmartPhone here...
		/**
		browseWeb
		findPosition
		ringAlarm
		playGame
		printLastnumbers
		call (calls recordNumber)

		*/
	}
}