package q2overriding;

public class OldPhone implements Phone {
	public void call(String number) {
		System.out.println("Calling <" + number + ">...");
	}
}