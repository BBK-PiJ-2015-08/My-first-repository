public class Ex1a {
        static String dodgyMethod(int n) {
            String result = dodgyMethod(n-3) + n + dodgyMethod(n-2);
            if (n <= 0) {
                return "";
            }
            return result;
        }
}
/** 3
result = dodgyMethod(0) + 3 + dodgyMethod(1)
 = dodgyMethod(0-3) + 0 + dodgyMethod(0-2)
 it will keep going
 */