package lesson6_34.lesson9E;

public class UserRepository {
    private User[] users;
    private String[] strings;
    private Long[] longs;
    private String[] arraySessionId;

    UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

//-----------------------------------------------------------------------------------------------------
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

//-----------------------------------------------------------------------------------------------------
    public User getUserByName(String name) {
        int count = 0;
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (name.equals(users[i].getName())) {
                user = users[i];
                break;
            }
            count++;
        }
        return user;
    }

    public User getUserBySessionId(String sessionId) {
        arraySessionId = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            arraySessionId[i] = users[i].getSessionId();
        }
        int count = 0;
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (sessionId.equals(users[i].getSessionId())) {
                user = users[i];
                break;
            }
            count++;
        }
        return user;
    }

//-----------------------------------------------------------------------------------------------------

    private User findById(long id) {
        int count = 0;
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null){
                if (id == users[i].getId()) {
                    user = users[i];
                    break;
                }
            }
            count++;
        }
        return user;
    }

    public User save(User user) {
        if (findById(user.getId()) != null)
            return null;

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return user;
            }
        }
        return null;
    }

//-----------------------------------------------------------------------------------------------------
    public User updater(User user){
        if (findById(user.getId()) != null) {
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) {
                    if (users[i].getId() == user.getId()) {
                        users[i] = user;
                        return user;
                    }
                }
            }
        }
            return null;
    }

    public void delete(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getId() == id) {
                    users[i] = null;
                }
            }
        }
    }
}