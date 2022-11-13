package DuckStrategy;

public class BathDuck extends NewDuck {

    public BathDuck() {
        flyBehaviour = new NoFly();
    }
}
