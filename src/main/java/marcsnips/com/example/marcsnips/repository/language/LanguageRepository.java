package marcsnips.com.example.marcsnips.repository.language;

import marcsnips.com.example.marcsnips.model.language.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository
        extends JpaRepository<Language, Long> {

}
