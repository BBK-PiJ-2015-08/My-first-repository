public class Ex1b {
    static int mcCarthy91(int n) {
        if (n > 100) {
            System.out.println("n is less than 100");
            return n - 10;
        } else {
            System.out.println("n is greater than or equal to 100");
            return mcCarthy91(mcCarthy91(n+11));
        }
    }
}