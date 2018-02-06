/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        char c = '\u2764';
        System.out.println(c);

        System.out.println("☺");
        System.out.println("\uD83D\uDE01 \uD83D\uDE13");

        char c1 = 'a';
        char c2 = '\n'; // \', \", \\, \n, \t, \0
        char c3 = '\u2764';
        char c4 = 1232;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        // "D:\\"
        System.out.println("\"D:\\\\\"");

        String s = "Unicode emoticons\n" +
                "unicodeemoticons.com/\n" +
                "surprised and smiling ｡◕‿‿◕｡ smiling catface. ^̮^. happy. (◕‿◕). smiling. (｡◕‿◕｡) surprised and smiling. (｡◕‿‿◕｡) smiling catface. (^̮^). happy. ʘ‿ʘ. smiling. ಠ_ಠ. [meme] look of disapproval. ಠ⌣ಠ. devious smile. ಠ‿ಠ. devious face. (ʘ‿ʘ). smiling. (ಠ_ಠ). look of disapproval. (ಠ⌣ಠ). devious smile. (ಠ‿ಠ). devious face.";

        System.out.println("D:");
    }


}
