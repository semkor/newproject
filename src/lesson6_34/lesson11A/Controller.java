package lesson6_34.lesson11A;

import java.util.Arrays;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] rooms11 = apis[0].findRooms(price, persons, city, hotel);
        Room[] rooms12 = apis[1].findRooms(price, persons, city, hotel);
        Room[] rooms13 = apis[2].findRooms(price, persons, city, hotel);

        if (rooms11 == null && rooms12 == null && rooms13 == null) {
            System.err.println("Cовпадений по заданным параметрам  не найдены");
            System.exit(0);
        }

        int count=0;
        for (int i = 0; i < rooms11.length; i++) {
            for (int j = 0; j < rooms12.length; j++) {
                if (rooms12[j]!=null && rooms11[i].getId() == rooms12[j].getId()) {
                    rooms12[j] = null;
                    count++;
                }
            }
            for (int k = 0; k < rooms13.length; k++) {
                if (rooms13[k]!=null && rooms11[i].getId() == rooms13[k].getId()) {
                    rooms13[k] = null;
                    count++;
                }
            }
        }

        Room[] roomsResult=new Room[rooms11.length+rooms12.length+rooms13.length-count];
        System.arraycopy(rooms11,0,roomsResult,0,rooms11.length);
        int countPlace=rooms11.length;
        for(int i=0;i<rooms12.length;i++) {
            if (rooms12[i] != null) {
                roomsResult[countPlace] = rooms12[i];
                countPlace++;
            }
        }
        for(int j=0;j<rooms13.length;j++) {
            if (rooms13[j] != null) {
                roomsResult[countPlace] = rooms13[j];
                countPlace++;
            }
        }
        return roomsResult;
    }


    public Room[] check(API api1, API api2) {
        Room[] rooms21 = api1.getAll();
        Room[] rooms22 = api2.getAll();

        int count = 0;
        for (int i = 0; i < rooms22.length; i++) {
            for (int j = 0; j < rooms21.length; j++) {
                if (rooms22[i].getPrice() == rooms21[j].getPrice() && rooms22[i].getPersons() == rooms21[j].getPersons() && rooms22[i].getCityName().equalsIgnoreCase(rooms21[j].getCityName()) && rooms22[i].getHotelName().equalsIgnoreCase(rooms21[j].getHotelName()))
                    count++;
            }
        }

        if (count == 0) {
            System.err.println("Cовпадений нет");
            System.exit(0);
        }

        Room[] rooms = new Room[count];
        int number = 0;
        for (int i = 0; i < rooms22.length; i++) {
            for (int j = 0; j < rooms21.length; j++) {
                if (rooms22[i].getPrice() == rooms21[j].getPrice() && rooms22[i].getPersons() == rooms21[j].getPersons() && rooms22[i].getCityName().equalsIgnoreCase(rooms21[j].getCityName()) && rooms22[i].getHotelName().equalsIgnoreCase(rooms21[j].getHotelName())) {
                    rooms[number] = rooms21[j];
                    number++;
                }
            }
        }
        return rooms;
    }


    public Room cheapestRoom() {
        Room result = null;
        Room[] rooms3 = apis[2].getAll();
        int min = rooms3[0].getPrice();
        for (int i = 1; i < rooms3.length; i++) {
            if (min >= rooms3[i].getPrice()) {
                min = rooms3[i].getPrice();
                result = rooms3[i];
            }
        }
        return result;
    }
}