package SpringBoot.Service;

import SpringBoot.Dao.FakeUserDaoImpl;
import SpringBoot.Dao.UserDao;
import SpringBoot.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    @Qualifier("mySql")
    private UserDao userDao;


    public Collection<User> getAllUser() {
        return userDao.getAllUser();
    }


    public  User getUserById(int id){
        return this.userDao.getUserById(id);
    }

    public void removeUserById(int id) {
        userDao.removeUserById(id);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
