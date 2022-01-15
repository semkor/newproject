package lesson6_34.lesson11A;


public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }


    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count3 = totalRooms(price, persons, city, hotel);

        if(count3==0){
            System.err.println("Cовпадений по заданному параметру  не найдено");
            return null;
        }

        Room[] methodRoom3 = new Room[count3];
        int number=0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName().equalsIgnoreCase(city) && rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                methodRoom3[number] = rooms[i];
                number++;
            }
        }
        return methodRoom3;
    }


//возвращает массив комнат
    @Override
    public Room[] getAll() {
        return rooms;
    }



    private int totalRooms(int price, int persons, String city, String hotel){
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons && rooms[i].getCityName().equalsIgnoreCase(city) && rooms[i].getHotelName().equalsIgnoreCase(hotel)) {
                count++;
            }
        }
       return count;
    }
}
