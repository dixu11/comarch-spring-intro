package spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
@Configuration
public class ConfigurationClass {
    //możecie również powiedzieć Spring że ma dodać obiekt do puli (bean do contenera) przez metody klas konfiguracyjnych
    //i adnotację @Bean

    @Bean
    public Random createRandom() {
        System.out.println("Spring uzywaj tego randoma ktorego Ci podrzuce");
        return new Random();
    }
}
