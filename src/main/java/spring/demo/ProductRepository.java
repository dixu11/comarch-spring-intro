package spring.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//Jest to najprostszy sposób kontaktu z bazą danych. Dziedziczymy odpowiednią klasę z modułu JPA, wskazujemy typ encji i typ
//ID dzięki czemu mamy dostęp do puli automatycznie wygenerowanych metod gdy podstawiamy typ ProductRepository pod konstruktor
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
