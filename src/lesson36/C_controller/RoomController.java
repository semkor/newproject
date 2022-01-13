package lesson36.C_controller;

import lesson36.B_model.Filter;
import lesson36.B_model.Room;
import lesson36.D_service.RoomService;

import java.util.Map;
import java.util.Set;

public class RoomController {
    private static RoomService roomService = new RoomService();

    public static Set<Room> findRooms(Filter filter){
        return roomService.findRooms(filter);
    }

    public static Room addRoom(Room room) {
        return roomService.addRoom(room);
    }

    public static void deleteRoom(long RoomId) {
        roomService.deleteRoom(RoomId);
    }
}
