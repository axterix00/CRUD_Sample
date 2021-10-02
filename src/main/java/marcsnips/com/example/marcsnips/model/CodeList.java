package marcsnips.com.example.marcsnips.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class CodeList extends Auditable<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String snippet;
    private String description;
    private Integer id_language;
    private Integer id_type;

    public CodeList() {
    }

    public CodeList(Long id, String name, String snippet, String description, Integer id_language, Integer id_type) {
        this.id = id;
        this.name = name;
        this.snippet = snippet;
        this.description = description;
        this.id_language = id_language;
        this.id_type = id_type;
    }

    public CodeList(String name, String snippet, String description, Integer id_language, Integer id_type) {
        this.name = name;
        this.snippet = snippet;
        this.description = description;
        this.id_language = id_language;
        this.id_type = id_type;
    }

}
