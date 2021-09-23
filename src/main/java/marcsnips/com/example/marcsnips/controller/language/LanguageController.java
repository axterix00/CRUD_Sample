package marcsnips.com.example.marcsnips.controller.language;

import marcsnips.com.example.marcsnips.service.language.LanguageService;
import marcsnips.com.example.marcsnips.model.language.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/language")
public class LanguageController {

    private final LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping
    public List<Language> getLanguage() {
        return languageService.getLanguage();
    }
}
