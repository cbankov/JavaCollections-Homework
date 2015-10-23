import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert n Strings separated by space = ");
        String[] strArr = scanner.nextLine().trim().split("\\s");
        for (int i = 0; i < strArr.length; i++) {
            String currentStr = strArr[i];
            System.out.print(currentStr);

            for (int j = i + 1; j < strArr.length; j++) {
                String compareStr = strArr[j];
                if (compareStr.equals(currentStr)) {
                    System.out.print(" " + compareStr);
                    i++;
                }
            }
            System.out.println();
        }
    }
}