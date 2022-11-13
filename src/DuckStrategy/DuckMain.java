package DuckStrategy;

public class DuckMain {

    public static void main(String[] args) {

        BlueDuck blueDuck = new BlueDuck();

        BathDuck bathDuck = new BathDuck();

        blueDuck.fly();
        bathDuck.fly();

        blueDuck.setFlyBehaviour(new NoFly());
        blueDuck.fly();
    }
}
