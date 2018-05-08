package SpringBoot.Dao;

import SpringBoot.Entity.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeUserDaoImpl implements UserDao {
    private static Map<Integer, User> users;

    static {
        users = new HashMap<Integer, User>() {
            {
                put(1, new User(1, "Joe", "London"));
                put(2, new User(2, "Hanna", "Polermo"));
                put(3, new User(3, "Eve", "Piura"));
                put(4, new User(4, "Frank", "Madurai"));
            }
        };
    }
    @Override
    public Collection<User> getAllUser() {
        return this.users.values();
    }
    @Override
    public  User getUserById(int id){
        return this.users.get(id);
    }

    @Override
    public void removeUserById(int id) {
        users.remove(id);
    }

    @Override
    public void updateUser(User user) {
       User u= users.get(user.getId());
       u.setCity(user.getCity());
       u.setName(user.getName());
    }
}
