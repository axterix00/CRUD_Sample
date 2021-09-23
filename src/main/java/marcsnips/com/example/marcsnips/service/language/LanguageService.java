package marcsnips.com.example.marcsnips.service.language;

import marcsnips.com.example.marcsnips.model.language.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    public List<Language> getLanguage() {
        return List.of(
                new Language(
                        1L,
                        "JavaScript"
                )
        );
    }

}
