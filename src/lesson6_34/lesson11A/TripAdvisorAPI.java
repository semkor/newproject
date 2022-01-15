package lesson6_34.lesson11A;

public class TripAdvisorAPI implements API {
    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count2 = totalRooms(price, persons, city, hotel);

        if (count2 == 0) {
            System.err.println("Cовпадений по заданным параметрам  не найдены");
            return null;
        }

        Room[] methodRoom2 = new Room[count2];
        int number = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getCityName().equalsIgnoreCase(city) && rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                if (((((persons - 1) <= rooms[i].getPersons()) && (rooms[i].getPersons() <= persons)) || ((rooms[i].getPersons() >= persons) && (rooms[i].getPersons() <= (persons + 1))))) {
                    methodRoom2[number] = rooms[i];
                    number++;
                }
            }
        }
        return methodRoom2;
    }


    @Override
    public Room[] getAll() {
        return rooms;
    }


    private int totalRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getCityName().equalsIgnoreCase(city) && rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                if (((((persons - 1) <= rooms[i].getPersons()) && (rooms[i].getPersons() <= persons)) || ((rooms[i].getPersons() >= persons) && (rooms[i].getPersons() <= (persons + 1))))) {
                    count++;
                }
            }
        }
        return count;
    }
}
