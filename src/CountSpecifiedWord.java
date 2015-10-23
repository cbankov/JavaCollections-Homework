import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert text (haystack) = ");
        String hayStack = scanner.nextLine().toLowerCase();
        System.out.print("Insert needle string = ");
        String needle = scanner.next().toLowerCase();

        int index = 0;
        int counter = 0;
        while (true) {
            int currentMatch = hayStack.indexOf(needle, index);
            if(currentMatch < 0) {
                break;
            }

            counter++;
            index = currentMatch + 1;
        }

        System.out.println(counter);
    }
}
