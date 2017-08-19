package ggibsen.tutorials.cucumber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ggibsen.tutorials.cucumber")
@SpringBootApplication
public class MainApp {
    public static void main(String[] args) throws Throwable {
        SpringApplication.run(MainApp.class, args);
    }
}