public class Day6Ex2 {
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
		arrayCopier.copy(src, dst);
		arrayCopier.printArray(dst);		
	}
}