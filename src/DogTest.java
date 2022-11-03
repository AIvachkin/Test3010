import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog dog;

    // переменная dog локальная приоритетнее в методе, нежели эта глобальная
//    но лучше локальные и глобальные переменные создавать с разными именами

    @BeforeEach
//    выполняется перед каждым модульный тестом
//    beforeall - один раз в самом начале перед всеми тестами
    void prepareData() {
        dog = new Dog("Bob", 5);
    }


    @org.junit.jupiter.api.Test
    void testGetDogName() {

        assertEquals("Bob", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogName() {
//        Dog dog = new Dog("Bob", 5);
        dog.setName("Albert");
        assertEquals("Bob", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameIfEmpty() {
        Dog dog = new Dog("", 5);
        dog.setName("Albert");
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}