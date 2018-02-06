/**
 * @author bvanchuhov
 */
public class RadixExample {

    public static void main(String[] args) {
        int x1 = 23324; // 10 : 0, 1, 2, ... 9
        System.out.println(x1);

        int x2 = 0b101010; // 2: 0, 1
        System.out.println(x2);

        int x3 = 0x100; // 16: 0, 1, 2, ... 9, A, B, C, D, E, F
        System.out.println(x3);

        String s = Integer.toBinaryString(214);
        System.out.println(s);
    }
}
