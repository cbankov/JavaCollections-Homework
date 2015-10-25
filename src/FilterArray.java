import java.util.Scanner;
import java.util.stream.Stream;

public class FilterArray {
    public static void main(String[] args) {
        Stream.of(new Scanner(System.in).nextLine().split(" ")).filter(s -> s.length() > 3).forEach(e -> System.out.print(e + " "));
    }
}