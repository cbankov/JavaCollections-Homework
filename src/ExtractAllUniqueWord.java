import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllUniqueWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert text = ");
        String input = scanner.nextLine().toLowerCase();

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(input);

        Set<String> results = new TreeSet<>();
        while (matcher.find()) {
            results.add(matcher.group());
        }

        for (String result : results) {
            System.out.print(result + " ");
        }
    }
}
