package marcsnips.com.example.marcsnips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MarcsnipsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarcsnipsApplication.class, args);
    }

    @GetMapping
    public String getOut() {
        return "Get Out";
    }
}
