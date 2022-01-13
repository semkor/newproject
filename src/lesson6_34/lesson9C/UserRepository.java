package lesson6_34.lesson9C;

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
            if (users[i] != null)
                strings[i] = users[i].getName();
        }
        return strings;
    }

    public Long[] getUserIds() {
        Long[] longs = new Long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
                longs[i] = users[i].getId();
        }
        return longs;
    }

    public String getUserNameById(long id) {
        String result = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && id == users[i].getId()) {
                result = users[i].getName();
                break;
            }
        }
        return result;
    }

    //-----------------------------------------------------------------------------------------------------
    public User getUserByName(String name) {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && name.equals(users[i].getName())) {
                user = users[i];
                break;
            }
        }
        return user;
    }

    public User getUserBySessionId(String sessionId) {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && sessionId.equals(users[i].getSessionId())) {
                user = users[i];
                break;
            }
        }
        return user;
    }

//-----------------------------------------------------------------------------------------------------

    private User findById(long id) {
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && id == users[i].getId()) {
                user = users[i];
                break;
            }
        }
        return user;
    }

    public User save(User user) {
        if (findById(user.getId()) != null)
            return null;

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null)
                return users[i] = user;
        }
        return null;
    }
}