package marcsnips.com.example.marcsnips.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Getter
@Setter
@Entity
@Table
public class User extends Auditable<String> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public User(Long id, String name, String login, String password, LocalDate dob) {
        this.id = id;
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
