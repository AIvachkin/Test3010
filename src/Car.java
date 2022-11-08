import java.util.ArrayList;

public class Car {

    private final String manufacturer;
    private String number;
    private final int year;
    private String owner;

//    ввели лист прошлых владельцев

    private final ArrayList<String> owners = new ArrayList<>();


    public String getManufacturer() {
        return manufacturer;
    }

    public Car(String manufacturer, String number, int year, String owner) {
        this.manufacturer = manufacturer;
        this.number = number;
        this.year = year;
        this.owner = owner;
//        при создании нового объекта добавляем в лист текущего владельца
        owners.add(owner);
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
        //        при изменении владельца добавляем его в лист
        owners.add(owner);
    }

    public ArrayList<String> getOwners() {
        return owners;
    }

    private String testMethod() {
        return "abc";
    }

    private String testMethod(String a) {
        return "abc" + a;
    }

    public int testInt(int a) {
        return a + 4;
    }

    public String getDataFromRemoteServer() throws Exception {

        throw new Exception("error!!!");
    }

    public void printCar (Car car){
        System.out.println(car);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", number='" + number + '\'' +
                ", year=" + year +
                ", owner='" + owner + '\'' +
                ", owners=" + owners +
                '}';
    }


}
