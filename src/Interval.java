import java.util.Scanner;


public class Interval {

//    вводим начальное и конечное значение
//    выводим числа, кратные 5
//    затем ожидаем новый ввод
//    прерывание при вводе "е" без учета регистра

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input1 = Integer.MIN_VALUE;
        int input2 = Integer.MIN_VALUE;
        String input1A;
        String input2A;
        boolean a = false;
        boolean b = false;

        do {
            System.out.println("Введите начальное значение интервала. Для выхода нажмите Е");
            input1A = scanner.nextLine();
            System.out.println("Вы ввели: начальное значение - " + input1A);

            if (isNumeric(input1A)) {
                input1 = Integer.parseInt(input1A);
                a = true;
            }


            System.out.println("Введите конечное значение интервала. Для выхода нажмите Е");
            input2A = scanner.nextLine();

            if (isNumeric(input2A)) {
                input2 = Integer.parseInt(input2A);
                b = true;
            }

            if (a && b) {
                for (int i = input1; i <= input2; i++) {
                    if (i % 5 == 0) {
                        System.out.println(i);
                    }
                }
                input2 = Integer.MIN_VALUE;
                input1 = Integer.MIN_VALUE;
                a = false;
                b = false;

            } else {
                System.out.println("Некорректный ввод. Введите повторно целочисленные значения");
            }

        }
        while (!((input1A.equalsIgnoreCase("E")) || (input2A.equalsIgnoreCase("E"))));

    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}