import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert text (haystack) = ");
        String hayStack = scanner.nextLine().toLowerCase();
        System.out.print("Insert needle string = ");
        String needle = scanner.next().toLowerCase();

        System.out.println(Stream.of(hayStack.trim().split("[^a-z]")).filter(s -> s.equals(needle)).count());
    }
}
