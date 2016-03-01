//by Keith
public class Doubler {
	private static Map<Integer, Integer> memo = new ConcurrentHashMap<>();

	public static Integer doubleValue(iInteger x) {
		if (memo.containsKey(x)) {
			System.out.println("using memo");
			return memo.get(x);
		} else {
			int res = x * 2;
			memo.put(x, res);
			//put for the key x the result of doubling it.
			return res;
		}
	}

	class TestDoubler {
		public static void main(String[] args) {
			System.out.println(Doubler.doubleValue(6));
			System.out.println(Doubler.doubleValue(16));
			System.out.println(Doubler.doubleValue(6));
			System.out.println(Doubler.doubleValue(16));
			System.out.println(Doubler.doubleValue(6));
			System.out.println(Doubler.doubleValue(16));
			System.out.println(Doubler.doubleValue(6));
		}
	}
}