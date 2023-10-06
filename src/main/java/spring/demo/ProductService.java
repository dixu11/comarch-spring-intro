package spring.demo;

import org.springframework.stereotype.Service;

//@Component
@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /*public ProductService() {
        System.out.println("Tworzę serwis");
    }*/

    public void addProduct(Product product) {
        if (product.getName().isEmpty()) {
            throw new IllegalArgumentException("Produkt pusty!"); // wyjątek może być obsłużony w kontrolerze żeby np. ustawić odpowiedni status odpowiedzi http
        }

        System.out.println("Zapisuję " + product + " do bazy danych");
        productRepository.save(product);
    }

}
