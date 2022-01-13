package lesson6_34.lesson9E;

public class UserRepository {
    private User[] users;

    UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    //-----------------------------------------------------------------------------------------------------
    public String[] getUserNames() {
        String[] strings = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                strings[i] = users[i].getName();
            }
        }
        return strings;
    }

    public Long[] getUserIds() {
        Long[] longs = new Long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                longs[i] = users[i].getId();
            }
        }
        return longs;
    }

    public String getUserNameById(long id) {
        String result = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && id == users[i].getId()) {
                return result = users[i].getName();
            }
        }
        return result;
    }

    //-----------------------------------------------------------------------------------------------------
    public User getUserByName(String name) {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && name.equals(users[i].getName())) {
                return user = users[i];
            }
        }
        return user;
    }

    public User getUserBySessionId(String sessionId) {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && sessionId.equals(users[i].getSessionId())) {
                return user = users[i];
            }
        }
        return user;
    }

//-----------------------------------------------------------------------------------------------------

    private User findById(long id) {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && id == users[i].getId()) {
                return user = users[i];
            }
        }
        return user;
    }

    public User save(User user) {
        if (findById(user.getId()) != null)
            return null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                return users[i] = user;
            }
        }
        return null;
    }

    //-----------------------------------------------------------------------------------------------------
    public User updater(User user) {
        if (findById(user.getId()) != null) {
            for (int i = 0; i < users.length; i++) {
                if (users[i] != null && users[i].getId() == user.getId()) {
                    return users[i] = user;
                }
            }
        }
        return null;
    }

    public void delete(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].getId() == id) {
                users[i] = null;
            }
        }
    }
}