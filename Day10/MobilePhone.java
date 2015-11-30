public class MobilePhone extends OldPhone {
	private String number1 = null;
	private String number2 = null;
	private String number3 = null;
	private String number4 = null;
	private String number5 = null;
	private String number6 = null;
	private String number7 = null;
	private String number8 = null;
	private String number9 = null;
	private String number10 = null;

	@Override
	public void call(String number) {
		super.call(number);
		if (number1 == null) {
			number1 = number;
		} else if (number2 == null) {
			number2 = number;
		} else if (number3 == null) {
			number3 = number;
		} else if (number4 == null) {
			number4 = number;
		} else if (number5 == null) {
			number5 = number;
		} else if (number6 == null) {
			number6 = number;
		} else if (number7 == null) {
			number7 = number;
		} else if (number8 == null) {
			number8 = number;
		} else if (number9 == null) {
			number9 = number;
		} else if (number10 == null) {
			number10 = number;
		} else if (number10 != null) {
			number1 = number2;
			number2 = number3;
			number3 = number4;
			number4 = number5;
			number5 = number6;
			number6 = number7;
			number7 = number8;
			number8 = number9;
			number9 = number10;
			number10 = number;
		}
	}


	public void ringAlarm(String alarmName) {
		System.out.println("Your" + alarmName + " is sounding!");
	}
	public void playGame(String game) {
		System.out.println("Now playing " + game);
	}
	@Override
	public void call(String number) {
		System.out.println("Calling <" + number + ">...");
	}
}