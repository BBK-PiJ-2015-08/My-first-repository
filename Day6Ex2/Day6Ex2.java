public class Day6Ex2 {
	public static void main(String[] args) {
		System.out.println("Choose shorter, same or longer");
		String choice = System.console().readLine();
		if (choice=="shorter") {
				int[] src = new int[5];
				int[] dst = new int[7];
				src[0] = 2;
				src[1] = 4;
				src[2] = 6;
				src[3] = 8;
				src[4] = 10;
		} else if (choice=="same"){
				int[] src = new int[7];
				int[] dst = new int[7];
				src[0] = 2;
				src[1] = 4;
				src[2] = 6;
				src[3] = 8;
				src[4] = 10;
				src[5] = 12;
				src[6] = 14;
		} else if (choice=="longer") {
				int[] src = new int[10];
				int[] dst = new int[7];
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
		}
		ArrayCopier arrayCopier = new ArrayCopier();
		arrayCopier.copy(src);
		arrayCopier.printArray(arrayCopier.dst);
	}

}