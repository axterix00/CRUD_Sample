package marcsnips.com.example.marcsnips.controller;

import marcsnips.com.example.marcsnips.service.LanguageService;
import marcsnips.com.example.marcsnips.model.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/language")
public class LanguageController {

    private final LanguageService languageService;

    //@Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping
    public List<Language> getLanguage() {
        return languageService.getLanguage();
    }
}
