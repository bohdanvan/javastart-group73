/**
 * @author bvanchuhov
 */
public class StringPractice {

    public static void main(String[] args) {
        String s = "I love Java";

        char c = s.charAt(2);
        System.out.println(c);

        // 1
        String upperCase = s.toUpperCase();
        System.out.println(upperCase);

        // 2
        boolean startsWithJava = s.startsWith("Java");
        System.out.println(startsWithJava);

        // 3
        int indexOfJava = s.indexOf("Java");
        System.out.println(indexOfJava);

        System.out.println(s.contains("Java"));

        System.out.println(s.equals("I love Java"));

        System.out.println(s.equalsIgnoreCase("I LOVE JAVA"));

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }
}
