public class Marking {
	private int failed = 0;
	private int passes = 0;
	private int distinctions = 0;
	String str = new String();

	public void markThis() {
		do {
			int i = 0;
			System.out.println("Enter a mark between 0 and 100, -1 to terminate");
			str = System.console().readLine();
			i = Integer.parseInt(str);
			if (i>-1 && i<= 49) {
				failed++;
			} else {
				if (i>-1 && i<=69) {
					passes++;
				} else {
					if (!(i>69 && i<=100)) {
						System.out.println("Invalid input");
					}
					else {
						if (i>69 && i<=100) {
						distinctions++;
					}
				}
			}
		}
			i++;
		} while (!str.equals("-1"));
		System.out.println("Total number of distinctions: " + distinctions);
		System.out.println("Total number of passes: " + passes);
		System.out.println("Total number of failed: " + failed);
	}
	public static void main(String[] args) {
		Marking theMark = new Marking();
		theMark.markThis();
	}
}