package ua.lviv.iot.fortifications;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.lviv.iot.fortifications.manager.FortificationRepository;
import ua.lviv.iot.fortifications.models.Trench;

@SpringBootApplication
public class FortificationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FortificationsApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(FortificationRepository repository) {
        return (args) -> {
            repository.save(new Trench(45, 65, 38, 21));
            repository.save(new Trench(33, 66, 43, 77));

            repository.findAll().forEach(fortifications -> System.out.println(fortifications));
        };


    }

}
