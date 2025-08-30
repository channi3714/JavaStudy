package Ex;

public class CondEx7 {
    public static void main(String[] args) {
        int x = 22541;

        String status = (x % 2 == 1) ? "홀수" : "짝수";
        System.out.println("x = " + x + ", " + status);
    }

}
