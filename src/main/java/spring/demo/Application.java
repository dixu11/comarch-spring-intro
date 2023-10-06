package spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //uruchamia component scan -> szuka adnotacji na klasach w tym pakiecie i wgłąb (@Component!)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
