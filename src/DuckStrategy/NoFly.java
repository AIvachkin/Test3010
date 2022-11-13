package DuckStrategy;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
