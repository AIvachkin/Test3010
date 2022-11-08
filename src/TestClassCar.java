import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClassCar {


    @Test
    @EnabledOnOs(OS.WINDOWS)
    @EnabledOnJre(JRE.JAVA_11)
    public void getCarYear(){

        CarOther car = new CarOther(2000, "blue", 2020, 240);
        assertEquals (2020, car.getYear());
    }

    @Test
    public void getCarWeight(){

        CarOther car = new CarOther(2000, "blue", 2020, 240);
        assertEquals (2000, car.getWeight());
    }

    @Test
    public void getCarSpeed(){

        CarOther car = new CarOther(2000, "blue", 2020, 240);
        assertEquals (240, car.getMaxSpeed());
    }
}
