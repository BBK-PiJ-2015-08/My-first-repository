public class ArrayCopier2a {
	public int[] src = new int[7]; 
	public int[] dst = new int[7];

	public int[] copy(int[] src, int[] dst) {
		for (int i=0; i<src.length; i++) {
			dst[i] = src[i];
		}
	}
}