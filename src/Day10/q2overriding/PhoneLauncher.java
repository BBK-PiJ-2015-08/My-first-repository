package q2overriding;

public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {
	// your code creating and using SmartPhone here...
		SmartPhone iPhone = new SmartPhone();
		iPhone.ringAlarm("morning");
		iPhone.findPosition();
		iPhone.browseWeb("http://www.google.com");
		iPhone.playGame("Snake");

		iPhone.call("0207 789 1234");
		iPhone.call("118 118");
		iPhone.call("0800 888 9911");
		iPhone.call("999");
		iPhone.call("0192 890 9000");
		iPhone.call("0091 982 9098290");
		iPhone.call("0207 789 4321");
		iPhone.call("0207 987 1234");
		iPhone.call("0777 198 9090");
		iPhone.call("911");
		// 10th number; next number should shift list up removing first number called.
		iPhone.call("001 781 787 7777");
		iPhone.printLastNumbers();
	}
}