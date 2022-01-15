package lesson6_34.lesson11A;

import java.util.*;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = totalRooms(price, persons, city, hotel);

        if(count==0){
            System.err.println("Cовпадений по заданным параметрам  не найдены");
            return null;
        }

        Room[] methodRoom1 = new Room[count];
        int number=0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPersons() == persons && rooms[i].getCityName().equalsIgnoreCase(city) && rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                if ((((price - 100) <= rooms[i].getPrice()) && (rooms[i].getPrice() <= price)) || ((rooms[i].getPrice() >= price) && (rooms[i].getPrice() <= (price + 100)))) {
                    methodRoom1[number] = rooms[i];
                    number++;
                }
            }
        }
        return methodRoom1;
    }


    @Override
    public Room[] getAll() {
        return rooms;
    }


    private int totalRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPersons() == persons && rooms[i].getCityName().equalsIgnoreCase(city) && rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                if ((((price - 100) <= rooms[i].getPrice()) && (rooms[i].getPrice() <= price)) || ((rooms[i].getPrice() >= price) && (rooms[i].getPrice() <= (price + 100)))) {
                    count++;
                }
            }
        }
        return count;
    }
}
