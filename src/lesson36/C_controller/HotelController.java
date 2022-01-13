package lesson36.C_controller;

import lesson36.B_model.Hotel;
import lesson36.D_service.HotelService;

import java.util.Map;
import java.util.Set;

import static lesson36.D_service.HotelService.findHotel;

public class HotelController {
    private static HotelService hotelService=new HotelService();

    public static Set<Hotel> findHotelByName(String name){
        return hotelService.findHotel(name);
    }

    public static Set<Hotel>  findHotelByCity(String city){
        return hotelService.findHotel(city);
    }

    public static Hotel addHotel(Hotel hotel){
    return hotelService.addHotel(hotel);
    }

    public static void deleteHotel(long hotelId){
        hotelService.deleteHotel(hotelId);
    }
}
