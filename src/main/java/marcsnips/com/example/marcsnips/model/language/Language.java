package marcsnips.com.example.marcsnips.model.language;

import lombok.Getter;
import lombok.Setter;
import marcsnips.com.example.marcsnips.model.Auditable;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Language extends Auditable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    public Language() {

    }

    public Language(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Language(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Snippet_Language{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
