package lesson6_34.lesson15A;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public User save(User user) {
        if (user == null)
            return null;

        int count = 0;
        for (User us : users) {
            if (us == null) {
                break;
            }
            count++;
        }
        return ifElse(user,count);
    }

    public User update(User user) {
        if (user == null)
            return null;

        int count=0;
        for (int i=0;i<users.length;i++){
            if (users[i] != null && users[i].equals(user)){
                users[i] = user;
                break;
            }
            count++;
        }
        return ifElse(user,count);
    }

    public void delete(long id){
        User tmp=new User(id,"","");
        for (int i=0;i<users.length;i++){
            if(users[i]!=null && users[i].equals(tmp)) {
                users[i] = null;
            }
        }
    }

    public User findUser(User user) {
        for (User us : users) {
            if (us != null && us.equals(user))
                return user;
        }
        return null;
    }

    private User ifElse(User user, int count){
        if (count == users.length)
            return null;
        else{
            users[count] = user;
            return user;
        }
    }
}
