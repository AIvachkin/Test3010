import java.util.Hashtable;
import java.util.Scanner;

public class HashImplementation2 {

//    консольное приложение: 1 - добавить сотрудника (Ф - И - возраст), 2 - удалить сотрудника (по фамилии),
//    3- вывести инфо обо всех сотрудниках
//    если фамилия при удалении не найдена - сообщаем, удаляем - сообщаем
//    e - выход из программы

    public static void main(String[] args) {

        String input;
        String nameEmployee;
        String lastnameEmployee;
        int ageEmployee;

        Scanner scanner = new Scanner(System.in);
        Hashtable<String, Employee> employees = new Hashtable<>();


        do {
            System.out.println("Введите 1 для добавления сотрудника, 2 - для удаления по фамилии, " +
                    "3 - для вывода списка всех сотрудников, e - для выхода из программы");

            input = scanner.next();

            switch (input) {
                case "1":
                    System.out.println("Введите имя сотрудника");
                    nameEmployee = scanner.next();
                    System.out.println("Введите фамилию сотрудника");
                    lastnameEmployee = scanner.next();
                    System.out.println("Введите возраст сотрудника");
                    ageEmployee = scanner.nextInt();

                    Employee employee = new Employee(nameEmployee, lastnameEmployee, ageEmployee);
                    employees.put(lastnameEmployee, employee);
                    break;

                case "2":
                    System.out.println("Введите фамилию сотрудника");
                    lastnameEmployee = scanner.next();
                    if (employees.containsKey(lastnameEmployee)) {
                        System.out.println("Удален сотрудник: \n" + employees.remove(lastnameEmployee));
                    } else {
                        System.out.println("Сотрудника с фамилией " + lastnameEmployee + " в базе нет");
                    }
                    break;

                case "3":

                    if (!employees.isEmpty()) {
                        for (Employee e : employees.values()
                        ) {
                            System.out.println(e);
                            System.out.println("_________");
                        }
                    }
                    break;
            }

        } while (!input.equalsIgnoreCase("E"));
    }
}




