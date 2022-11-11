import java.util.Scanner;

public class Massives {

    static int strings;
    static int columns;

    public static void main(String[] args) {

//        вводим в консоль кол-во строк и столбцов
//        формируем двумерный массив и выводим его в консоль
//        вводим номер строки и столбца и значение, которое хотим записать
//        выводим получившийся массив - программа завершает работу

        Scanner scanner = new Scanner(System.in);

        int indexOfString;
        int indexOfColumn;
        int volume;

        System.out.println("Введите кол-во строк");
        strings = scanner.nextInt();

        System.out.println("Введите кол-во столбцов");
        columns = scanner.nextInt();

        int[][] massive = new int[strings][columns];

        printMassive(massive);


        System.out.println("Введите индекс строки");
        indexOfString = scanner.nextInt();
        System.out.println("Введите индекс столбца");
        indexOfColumn = scanner.nextInt();
        System.out.println("Введите целочисленное значение для заданной ячейки");
        volume = scanner.nextInt();

        if (indexOfString < strings && indexOfColumn < columns) {
            massive[indexOfString][indexOfColumn] = volume;
            System.out.println("Искомое значение: " + massive[indexOfString][indexOfColumn]);
            printMassive(massive);
        } else {
            System.out.println("введена некорректная пара индексов - выходит за пределы массива");
        }
    }

    private static void printMassive(int[][] massive) {
        for (int i = 0; i < strings; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
    }
}


