public class ArrayCopier {

	public void copy(int[] src, int[] dst) {
		for (int i=0; i<src.length; i++) {
			dst[i] = src[i];
		}
	}

	public void printArray(int[] dst) {
		System.out.print("Destination array: ");
		for (int i=0; i<dst.length; i++) {
			if (i == (dst.length)-1) {
				System.out.println(dst[i]);
			} else {
				System.out.print(dst[i] + ", ");
			}

		}
	}
}