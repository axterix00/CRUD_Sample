package marcsnips.com.example.marcsnips.repository;

import marcsnips.com.example.marcsnips.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository
        extends JpaRepository<Language, Long> {

}
