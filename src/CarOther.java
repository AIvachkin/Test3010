import java.util.Objects;

public class CarOther {

    private int weight;
    private String color;
    private int year;
    private int maxSpeed;

    public CarOther(int weight, String color, int year, int maxSpeed) {
        this.weight = weight;
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarOther carOther = (CarOther) o;
        return weight == carOther.weight && year == carOther.year && maxSpeed == carOther.maxSpeed && Objects.equals(color, carOther.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, color, year, maxSpeed);
    }

    @Override
    public String toString() {
        return "CarOther{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
