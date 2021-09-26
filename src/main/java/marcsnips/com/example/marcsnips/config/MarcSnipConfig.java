package marcsnips.com.example.marcsnips.config;

import marcsnips.com.example.marcsnips.model.user.User;
import marcsnips.com.example.marcsnips.repository.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.time.LocalDate;
import java.util.List;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("marcsnips.com.example.marcsnips.repository")
@EnableJpaAuditing
public class MarcSnipConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(UserRepository repository) {
//        return args -> {
//            User Marc = new User(
//                    "Marc 21",
//                    "marcli",
//                    "Password123",
//                    LocalDate.of(1992, 2, 27)
//
//            );
//            User Other = new User(
//                    "Name",
//                    "Login",
//                    "Password",
//                    LocalDate.of(1993, 4, 6)
//            );
//
//            repository.saveAll(
//                    List.of(Marc, Other)
//            );
//        };
//    }
}
