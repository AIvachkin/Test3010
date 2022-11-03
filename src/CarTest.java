import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Skoda", "ABC1234", 2019, "Andrew");

    }

    @Test
    void getManufacturer() {
        assertEquals("Skoda", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("ABC1234", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("ABC12345");
        assertEquals("ABC12345", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2019, car.getYear());
    }

    @Test
    void getOwner() {
        assertEquals("Andrew", car.getOwner());

    }

    @Test
    void setOwner() {
        car.setOwner("Oleg");
        assertEquals("Oleg", car.getOwner());
    }

    @Test
    void getListOwners() {
        assertArrayEquals(new String[]{"Andrew"}, car.getOwners().toArray());
//        метод сравнивает массивы, не листы
//        проверяем, что добавился владелец в массив
    }

    @Test
//    тест, если у машины сменится владелец
    void getListTwoOwners() {
        car.setOwner("Oleg");
        assertArrayEquals(new String[]{"Andrew", "Oleg"}, car.getOwners().toArray());
    }

}