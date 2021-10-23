package marcsnips.com.example.marcsnips.service;

import marcsnips.com.example.marcsnips.model.User;
import marcsnips.com.example.marcsnips.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUser() {
        return userRepository.findAll();
    }

    public Optional<User> getUserWithId(Long id) {
        return userRepository.findById(id);
    }

    public void createUser(List<User> userList) {
        for (User user : userList) {
            Optional<User> userOptional = userRepository.findUserByLogin(user.getLogin());
            if (userOptional.isPresent()) {
                throw new IllegalStateException("login already exists");
            }
            userRepository.save(user);
        }
    }

    public void deleteUser(Long id) {
        boolean exists = userRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("user does not exists");
        }
        userRepository.deleteById(id);
    }

    @Transactional
    public void updateUser(Long id, String name, String login, String pass1, String pass2) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalStateException("user with id:" + id + " does not exist"));

        if (name != null && name.length() > 0 && !Objects.equals(user.getName(), name)) {
            user.setName(name);
        }
        if (login != null && login.length() > 0 && !Objects.equals(user.getLogin(), login)) {
            Optional<User> userOptional = userRepository.findUserByLogin(login);
            if (userOptional.isPresent()) {
                throw new IllegalStateException("login already exists");
            }
            user.setLogin(login);
        }

        if ((pass1 != null && pass1.length() > 0 && !Objects.equals(user.getPassword(), pass1)) &&
                (pass2 != null && pass2.length() > 0 && !Objects.equals(user.getPassword(), pass2))) {
            if (pass1.equals(pass2)) {
                user.setPassword(pass1);
            } else {
                throw new IllegalStateException("Pass1 and Pass2 not equal");
            }
        }
    }
}
