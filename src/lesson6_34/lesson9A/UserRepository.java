package lesson6_34.lesson9A;

import lesson6_34.lesson9E.User;

public class UserRepository {
    private User[] users;
    private String[] strings;
    private Long[] longs;

    UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }


    public String[] getUserNames() {
        strings = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            strings[i] = users[i].getName();
        }
        return strings;
    }


    public Long[] getUserIds() {
        longs = new Long[users.length];
        for (int i = 0; i < users.length; i++) {
            longs[i] = users[i].getId();
        }
        return longs;
    }


    public String getUserNameById(long id) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (id == longs[i]) {
                break;
            }
            count++;
        }
        return strings[count];
    }
}