import java.util.ArrayList;

public class Car {

    private final String manufacturer;
    private String number;
    private final int year;
    private String owner;

//    ввели лист прошлых владельцев

    private ArrayList<String> owners = new ArrayList<>();


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
}
