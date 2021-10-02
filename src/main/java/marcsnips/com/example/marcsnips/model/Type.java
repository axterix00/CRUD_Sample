package marcsnips.com.example.marcsnips.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Type extends Auditable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    public Type() {
    }

    public Type(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Type(String name) {
        this.name = name;
    }
}
