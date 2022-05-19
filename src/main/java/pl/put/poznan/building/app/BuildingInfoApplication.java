package pl.put.poznan.building.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Ale super komentarz
//bardzo ważny komentarz

@SpringBootApplication(scanBasePackages = {"pl.put.poznan.building.rest"})
public class BuildingInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuildingInfoApplication.class, args);
    }
}
