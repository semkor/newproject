package lesson6_34.lesson8.ads;

public class CarAd extends Ad {
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    public CarAd(long id, int price) {
        super(id, price);
    }

    void confirmAd(){
        //somelogic
    }
}
