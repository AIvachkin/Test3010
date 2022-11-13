package DuckStrategy;

public class NewDuck {

    FlyBehaviour flyBehaviour;

    public NewDuck() {

    }

    public void fly() {
        flyBehaviour.fly();
    }

//   Можем также налету переопределять реализацию
    public void setFlyBehaviour (FlyBehaviour fb){
        flyBehaviour = fb;
    }

}
