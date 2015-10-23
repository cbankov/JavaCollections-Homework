import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        strings.addAll(Arrays.asList(scanner.nextLine().split(" ")));

        strings.stream()
                .filter(s -> s.length() > 3)
                .forEach(e -> System.out.print(e + " "));
    }
}
