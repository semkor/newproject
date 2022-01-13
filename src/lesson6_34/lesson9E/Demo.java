package lesson6_34.lesson9E;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        User user1=new User(15151l,"test","123");
        User user2=new User(15152l,"test1","1234");
        User user3=new User(15153l,"test2","12345");
        User user4=new User(15154l,"test3","123456");
        User user5=new User(15155l,"test4","1234567");
        User user6=new User(15156l,"test5","12345678");
        User[] user={user1, user2, user3,null,user5,user6};

        User[] users1={null, null, null, null, null};

        UserRepository userRepository=new UserRepository(user);
        UserRepository userRepository1=new UserRepository(users1);
//---------------------------------------------------------------------------------
//        System.out.println(Arrays.toString(userRepository.getUsers()));
//
//        System.out.println(Arrays.toString(userRepository1.getUserNames()));
//
//        System.out.println(Arrays.toString(userRepository1.getUserIds()));
//
//        System.out.println(userRepository1.getUserNameById(15153l));
//---------------------------------------------------------------------------------

//           System.out.println(userRepository1.getUserByName("test8"));
//
//           System.out.println(userRepository1.getUserBySessionId("1234567"));

//---------------------------------------------------------------------------------

//            System.out.println(userRepository1.save(new User(15160l,"test4","1234567")));
//            System.out.println(userRepository1.save(new User(15157l,"test4","1234567")));

//---------------------------------------------------------------------------------

        System.out.println(Arrays.toString(userRepository1.getUsers()));
            System.out.println(userRepository1.updater(new User(15152l,"test88","12315167")));
            System.out.println(Arrays.toString(userRepository1.getUsers()));

            userRepository1.delete(15151l);
            System.out.println(Arrays.toString(userRepository1.getUsers()));

    }
}
