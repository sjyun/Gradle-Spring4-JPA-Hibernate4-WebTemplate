package repository;

import br.com.project.config.ConfigDatabase;
import br.com.project.config.ConfigMVC;
import br.com.project.model.User;
import br.com.project.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Kevin on 2015/3/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConfigDatabase.class})
public class JpaUserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void findAllUsers() {
        List<User> users = userRepository.findAll();

        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUser(){
        User user = new User("admin","haotb@email.com","admin");

        userRepository.save(user);

        findAllUsers();
    }
}
