package lesson6_34.lesson13A.homework11;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}
