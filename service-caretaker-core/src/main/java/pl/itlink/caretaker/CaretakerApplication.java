package pl.itlink.caretaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaretakerApplication {

    public static void main(String... args) {
        SpringApplication application = new SpringApplication(CaretakerApplication.class);
        application.run(args);
    }
}
