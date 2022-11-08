import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Parsed;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Skoda", "ABC1234", 2019, "Andrew");

    }

    @Test
//    @Execution(ExecutionMode.CONCURRENT)
    void getManufacturer() {
        assertEquals("Skoda", car.getManufacturer());
    }

    @Test
//    @Execution(ExecutionMode.CONCURRENT)
    void getNumber() {
        assertEquals("ABC1234", car.getNumber());
    }

    @Test
//    @Execution(ExecutionMode.CONCURRENT)
    void setNumber() {
        car.setNumber("ABC12345");
        assertEquals("ABC12345", car.getNumber());
    }

    @ParameterizedTest
    @ValueSource(strings = {"ASD", "12WER", "rt5"})
    @NullSource
    @EmptySource
//    @Execution(ExecutionMode.CONCURRENT)
    void testSetNumberMultipleValues(String number) {
        car.setNumber(number);
        assertEquals(number, car.getNumber());
    }

    @ParameterizedTest
    @CsvSource({"'ADS','ADS'",
            "'12w','12w'"})
//    @Execution(ExecutionMode.CONCURRENT)
    void testSetNumberMultipleValues(String number, String x) {
        car.setNumber(number);
        assertEquals(x, car.getNumber());
    }

    @ParameterizedTest
    @CsvSource({"1,5",
            "4,8",
            "23, 27"})
//    @Execution(ExecutionMode.CONCURRENT)
    void testInt(int input, int output) {
        assertEquals(output, car.testInt(input));
    }

    @Test
//    @Execution(ExecutionMode.CONCURRENT)
    void getYear() {
        assertEquals(2019, car.getYear());
    }

    @Test
//    @Execution(ExecutionMode.CONCURRENT)
    void getOwner() {
        assertEquals("Andrew", car.getOwner());

    }

    @Test
//    @Execution(ExecutionMode.CONCURRENT)
    void setOwner() {
        car.setOwner("Oleg");
        assertEquals("Oleg", car.getOwner());
    }

    @Test
//    @Execution(ExecutionMode.CONCURRENT)
    void getListOwners() {
        assertArrayEquals(new String[]{"Andrew"}, car.getOwners().toArray());
//        метод сравнивает массивы, не листы
//        проверяем, что добавился владелец в массив
    }

    @Test
//    @Execution(ExecutionMode.CONCURRENT)
//    тест, если у машины сменится владелец
    void getListTwoOwners() {
        car.setOwner("Oleg");
        assertArrayEquals(new String[]{"Andrew", "Oleg"}, car.getOwners().toArray());
    }

    @Test
//    @Execution(ExecutionMode.CONCURRENT)
    void testPrivateMethod() {
        try {
            Method method = Car.class.getDeclaredMethod("testMethod", null);

//            строека ниже - мы можем запустить этот метод (true), даже если он приватный - делаем его доступным
            method.setAccessible(true);

            assertEquals("abc", method.invoke(car).toString());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @ParameterizedTest
//    определяем название нашего модульного теста, которое будет отображаться в консоли при выполнении
    @DisplayName("Test demonstrates how test data could be loaded from file")
    @CsvFileSource(resources = "/test-data.csv", delimiter = '|', numLinesToSkip = 1)
//    @Execution(ExecutionMode.CONCURRENT)
    public void testNumbers(String input, String expected) {
        car.setNumber(input);
        assertEquals(expected, car.getNumber());
    }


    @Test
//    @Execution(ExecutionMode.CONCURRENT)
    void testPrivateMethodWithArgument() {

        try {
            Method method = Car.class.getDeclaredMethod("testMethod", String.class);

//            строека ниже - мы можем запустить этот метод (true), даже если он приватный - делаем его доступным
            method.setAccessible(true);

            assertEquals("abcd", method.invoke(car, "d").toString());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Test
    void getTestData() {
        Exception exception = assertThrows(Exception.class,
                () -> {
                    car.getDataFromRemoteServer();
                });
        assertEquals("error!!!", exception.getMessage());
    }

//    @Test
//    void printCar() {
//
////        пееменная, в которую мы будем сохранять то, что выводится в консоль
//        String consoleOutput;
////        то, что будем перехватывать
//        PrintStream originalOut = System.out;
//        try {
//            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(100);
//            PrintStream capture = new PrintStream(outputStream);
////            то, что печатается, заносится в capture
//            System.setOut(capture);
//        }

}