package spring.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//uwaga, adnotacje w tej klasie to adnotacje dla biblioteki Hibernate, nie Spring. Hibernate jest częścią JPA
@Entity // mowi hibernate ze to encja bazodanowa
public class Product {
    private String name;
    @Id // to jest moj klucz główny SQL
    @GeneratedValue // generuj go
    private int id;

    public Product(String name) {
        this.name = name;
    }

    public Product() {//pusty konstruktor wymagany przez hibernate
    }


    //getter/setter dla biblioteki Jackson
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
