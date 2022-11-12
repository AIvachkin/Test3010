import java.util.Enumeration;
import java.util.Hashtable;

public class HashImplementation {

    public static void main(String[] args) {

        var table = new Hashtable<String, String>();

        table.put("1", "asd");
        table.put("23", "asder");

        System.out.println(table);
//        если хотим узнать хеш
        System.out.println(Integer.valueOf(1).hashCode());
        System.out.println("asder".hashCode());

//        задаем начальное число векторов (бакетов)
//        Hashtable table2 = new Hashtable<>(10);

//        задаем и емкость, и кол-во ячеек в каждом вектора. По достижении этого кол-ва произойдет перекомпановка (load factor)
//        Hashtable table3 = new Hashtable<>(10, 0.5f);

        Enumeration<String> elements = table.elements();
        Enumeration<String> keys = table.keys();

        while (elements.hasMoreElements() && keys.hasMoreElements()) {
            System.out.println("Key value is: " + keys.nextElement() + ". Object value is: " + elements.nextElement());
        }

    }
}
