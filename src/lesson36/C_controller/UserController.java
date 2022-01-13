package lesson36.C_controller;

import lesson36.B_model.User;
import lesson36.D_service.UserService;
import lesson6_34.lesson27B.Exception.BadRequestException;

public class UserController {
    private static UserService userService=new UserService();

    public static void login(String UserName,String password)  {
            userService.login(UserName,password);
    }

    public static User registerUser(User user) {
        return userService.registerUser(user);
    }

    public static void logout(){
        userService.logout();
    }
}