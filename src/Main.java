import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        String result = makeUpper(str);
        System.out.println(result);
    }

    public static String makeUpper(String str) {
        return makeUpperMain(str, 0);
    }

    private static String makeUpperMain(String str, int i) {
        if (i == str.length()) {
            return "";
        } else {
            char cChar = str.charAt(i);
            char[] upperCaseChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            if (cChar >= 'a' && cChar <= 'z') {
                cChar = upperCaseChars[cChar - 'a'];
            }
            return cChar + makeUpperMain(str, i + 1);
        }
    }
}
