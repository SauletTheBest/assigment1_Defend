
public class Main {
    public static void main(String[] args) {
        String str = "hello";
        String result = convertToUpperCase(str);
        System.out.println(result);
    }

    public static String convertToUpperCase(String str) {
        return convertToUpperCaseHelper(str, 0);
    }

    private static String convertToUpperCaseHelper(String str, int index) {
        if (index == str.length()) {
            return "";
        } else {
            char currentChar = str.charAt(index);
            char[] upperCaseChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                    'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            if (currentChar >= 'a' && currentChar <= 'z') {
                currentChar = upperCaseChars[currentChar - 'a'];
            }
            return currentChar + convertToUpperCaseHelper(str, index + 1);
        }
    }
}
