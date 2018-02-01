/**
 * @author bvanchuhov
 */
public class Casting {

    public static void main(String[] args) {
        int x = 10;
        long y = 20;

        long z = x + y; // 30

        int a = (int) z; // BAD PRACTICE

        byte b = (byte) 200;
        System.out.println(b);
    }
}
