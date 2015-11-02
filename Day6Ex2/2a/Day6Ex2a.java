public class Day6Ex2a {
	public static void main(String[] args) {
		ArrayCopier arrayCopier = new ArrayCopier();
		int[] src = new int[7];
		int[] dst = new int[7];
		src[0] = 2;
		src[1] = 4;
		src[2] = 6;
		src[3] = 8;
		src[4] = 10;
		src[5] = 12;
		src[6] = 14;
		System.out.println("Your source array: " + (Arrays.toString(src)) );
		arrayCopier.copy(src, dst);
//Above using dot notation to call the method of an object.
		System.out.println("Your destination array: " + (Arrays.toString(dst)) );		
	}
}