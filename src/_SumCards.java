import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _SumCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cardsWithFace = new ArrayList<>();

        cardsWithFace.addAll(Arrays.asList(scanner.nextLine().split(" ")));

        List<Integer> cards = cardsWithFace.stream()
                .map(s -> s.substring(0,s.length() - 1))
                .map(s -> s.replace("J", "12").replace("Q", "13").replace("K", "14").replace("A", "15"))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        long sumOfAllCards = 0;
        for (int i = 0; i < cards.size(); i++) {
            int equals = 1;
            for (int j = i + 1; j <cards.size(); j++) {
                if(cards.get(i) == cards.get(j)) {
                    equals++;
                    i++;
                } else {
                    break;
                }
            }

            if(equals > 1) {
                sumOfAllCards += cards.get(i) * equals * 2;
            } else {
                sumOfAllCards += cards.get(i);
            }
        }

        System.out.println(sumOfAllCards);
    }
}
