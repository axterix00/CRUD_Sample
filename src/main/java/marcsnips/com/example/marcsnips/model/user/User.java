package marcsnips.com.example.marcsnips.model.user;

import lombok.Getter;
import lombok.Setter;
import marcsnips.com.example.marcsnips.model.Auditable;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table
public class User extends Auditable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID userProfileId;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "login", nullable = false, unique = true)
    private String login;
    private String password;
    private LocalDate dob;

    @Transient
    private Integer age;

    public User() {
    }

    public User(UUID userProfileId, String name, String login, String password, LocalDate dob) {
        this.userProfileId = userProfileId;
        this.name = name;
        this.login = login;
        this.password = password;
        this.dob = dob;
    }

    public User(String name, String login, String password, LocalDate dob) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(dob,LocalDate.now()).getYears();
    }
}
