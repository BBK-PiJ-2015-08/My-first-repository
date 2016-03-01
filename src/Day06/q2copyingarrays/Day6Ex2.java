package Day06.q2copyingarrays;

public class Day6Ex2 {

	public static void main(String[] args) {
		System.out.println("Choose shorter, same or longer");
		String choice = System.console().readLine();
		switch(choice) {
			case "shorter":
				int[] src = new int[5];
				int[] dst = new int[7];
				src[0] = 2;
				src[1] = 4;
				src[2] = 6;
				src[3] = 8;
				src[4] = 10;
				break;
			case "same":
				src = new int[7];
				dst = new int[7];
				src[0] = 2;
				src[1] = 4;
				src[2] = 6;
				src[3] = 8;
				src[4] = 10;
				src[5] = 12;
				src[6] = 14;
				break;
			case "longer":
				src = new int[10];
				dst = new int[7];
				src[0] = 2;
				src[1] = 4;
				src[2] = 6;
				src[3] = 8;
				src[4] = 10;
				src[5] = 12;
				src[6] = 14;
				src[7] = 16;
				src[8] = 18;
				src[9] = 20;
				break;
			default:
				System.out.println("Invalid input");
				break;
		}
		ArrayCopier arrayCopier = new ArrayCopier();
		arrayCopier.copy(this.src,this.dst);
		arrayCopier.printArray(this.dst);
	}
}