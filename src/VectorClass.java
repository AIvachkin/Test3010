import java.util.Scanner;
import java.util.Vector;

public class VectorClass {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во элементов для вектора");
        Vector<String> vector = new Vector<>(scanner.nextInt());

        for (int i = 0; i < vector.capacity(); i++) {
            System.out.println("Введите значение элемента вектора № " + (i + 1));
            vector.add(scanner.next());
        }

        System.out.println("Вектор содержит значения");
        System.out.println("________________________");
        for (String a : vector) {
            System.out.println(a);
        }

        System.out.println("Размер вектора: " + vector.size());
        System.out.println("Емкость вектора: " + vector.capacity());

    }

}
