import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String abc;

        do {
            System.out.println("Enter your command, to exit press A");
            abc = scanner.nextLine();
            System.out.println("You have entered: " + abc);
        } while (!abc.equals("A"));

        System.out.println(abc);

    }
}