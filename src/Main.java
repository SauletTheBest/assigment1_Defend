import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(makeUpper(str));

    }
    public static String makeUpper(String str){
        if (str.isEmpty()) {
            return "String is null";
        } else {
            char firstChar = Character.toUpperCase(str.charAt(0));
            return firstChar + makeUpper(str);
        }


    }
}