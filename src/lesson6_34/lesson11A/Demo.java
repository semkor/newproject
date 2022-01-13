package lesson6_34.lesson11A;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
//массив комнат
        Room room1 = new Room(1l, 50, 3, new Date(1650000000000l), "Tanus", "Kiev");
        Room room2 = new Room(2l, 700, 1, new Date(1650000000000l), "Franus", "Dnepr");
        Room room3 = new Room(3l, 150, 2, new Date(1650000000000l), "TFnus", "Lyvov");
        Room room4 = new Room(4l, 220, 2, new Date(1650000000000l), "Tanus", "Lyvov");
        Room room5 = new Room(5l, 80, 1, new Date(1650000000200l), "Gannus", "Moscow");
        Room room6 = new Room(6l, 30, 4, new Date(1650000200000l), "Lanus", "Germani");
        Room room7 = new Room(7l, 190, 3, new Date(1650000300000l), "Tranus", "Kiev");
        Room room8 = new Room(8l, 100, 1, new Date(1650000400000l), "Tanrus", "English");
        Room[] requestRooms = new Room[]{room1, room2, room3, room4, room5, room6, room7, room8};
//передача массива интерфейсных переменных в контроллер
//передача массива комнат на  три API
        API[] api=new API[3];
        api [0]= new BookingComAPI(requestRooms);
        api [1]= new TripAdvisorAPI(requestRooms);
        api [2]= new GoogleAPI(requestRooms);
        Controller controller = new Controller(api);

//запросы
     // 1+
       System.out.println(Arrays.toString(controller.requestRooms(50, 3, "Kiev", "Tanus")));
       System.out.println(Arrays.toString(controller.requestRooms(100,1, "English", "Tanrus")));
    // 2+
        API api1 = new BookingComAPI(requestRooms);

        Room room31 = new Room(3l, 150, 2, new Date(1650000000000l), "TFnus", "Lyvov");
        Room room41 = new Room(4l, 220, 2, new Date(1650000000000l), "Tanus", "Lyvov");
        Room room51 = new Room(5l, 80, 1, new Date(1650000000200l), "Gannus", "Moscow");
        Room[] requestRooms2 = new Room[]{room31, room41, room51};
        API api2 = new TripAdvisorAPI(requestRooms2);

        System.out.println(Arrays.toString(controller.check(api1, api2)));
    // 3+
        System.out.println(controller.cheapestRoom());
    }
}

