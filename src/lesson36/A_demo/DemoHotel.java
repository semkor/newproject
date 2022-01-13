package lesson36.A_demo;

import lesson36.B_model.ENUM.UserType;
import lesson36.B_model.Hotel;
import lesson36.C_controller.HotelController;
import lesson36.C_controller.UserController;
import lesson36.D_service.HotelService;
import lesson36.D_service.UserService;
import lesson36.E_repository.HotelRepository;
import lesson36.E_repository.UserRepository;
import lesson6_34.lesson27B.Exception.BadRequestException;

import java.util.Set;

import static lesson36.D_service.HotelService.findHotel;

public class DemoHotel {
    public static void main(String[] args)throws BadRequestException {

// --------------------------------------------- 1 блок -----------------------------------------------------
// поиск  по имени
//        Set<Hotel> list = HotelController.findHotelByCity("Reikartz");
//        for(Hotel el:list){
//            System.out.println(el);
//        }

// поиск  по городу
//        Set<Hotel> list2 = HotelController.findHotelByCity("Kiev");
//        for(Hotel el:list2){
//            System.out.println(el);
//        }

// --------------------------------------------- 2 блок -----------------------------------------------------
// добавление отеля
//        System.out.println(HotelController.addHotel(new Hotel("test1","Ukraine","Kiev","Matroskin")));
//
//        System.out.println(UserService.isStatus());
//        System.out.println(UserService.getUserType());
//        UserController.login("frolov","aD12345*");
//        System.out.println(HotelController.addHotel(new Hotel("test2","Ukraine","Kiev","Matroskin")));
//        System.out.println(HotelController.addHotel(new Hotel("test3","Ukraine","Kiev","Matroskin")));

// --------------------------------------------- 3 блок -----------------------------------------------------
// удаление отеля
//        HotelController.deleteHotel(2000000028l);
//        UserController.login("korm","3988dfdf");
//        HotelController.deleteHotel(2000000028l);
//        UserController.login("frolov","aD12345*");
//        HotelController.deleteHotel(2000000028l);

    }
}
