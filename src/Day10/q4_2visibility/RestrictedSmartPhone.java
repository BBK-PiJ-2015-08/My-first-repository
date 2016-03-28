package q4_2visibility;

public class RestrictedSmartPhone extends SmartPhone {
	public RestrictedSmartPhone(String brand) {
		super(brand);
	}

	@Override
	public void playGame(String game) {
		System.out.println("Now playing " + game);
	}
}