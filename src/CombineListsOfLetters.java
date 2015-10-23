import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        List<Character> result = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert text line 1 = ");
        String list1 = scanner.nextLine();
        System.out.print("Insert text line 2 = ");
        String list2 = scanner.nextLine();

        for (int i = 0; i < list1.length(); i++) {
            char currentChar = list1.charAt(i);
            if(currentChar != ' ') {
                result.add(currentChar);
            }
        }

        for (int i = 0; i < list2.length(); i++) {
            char currentChar = list2.charAt(i);
            if(currentChar != ' ' && !list1.contains("" + currentChar)) {
                result.add(currentChar);
            }
        }

        for (Character ch : result) {
            System.out.print(ch + " ");
        }
    }
}