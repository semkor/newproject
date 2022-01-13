package lesson6_34.lesson11A;

public interface API {
    Room[] findRooms(int price,int persons,String city,String hotel);
    Room[] getAll();
}
