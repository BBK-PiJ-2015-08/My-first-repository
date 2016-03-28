package q2copyingarrays;

public class ArrayCopier {
	public ArrayCopier() {

	}

	public int[] copy(int[] src, int[] dst) {
		if (src.length==dst.length || src.length>dst.length) {
			for (int i=0; i<dst.length; i++) {
				dst[i] = src[i];
			}
		}
		else if (src.length<dst.length) {
			for (int i=0; i<src.length; i++) {
				dst[i] = src[i];
			}
			for (int i=src.length; i<dst.length; i++) {
				dst[i] = 0;
			}
		}
		return dst;
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