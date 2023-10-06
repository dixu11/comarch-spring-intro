package spring.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Scanner;

//@Component // Spring zauwazy te adnotację i stworzy obiekt z tej klasy - bean i umieści go w Spring Context/container
@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) { //Spring automatycznie wykorzysta ten konstruktor i poszuka beana typu ProductService
        this.productService = productService;
        System.out.println("Stworzony bean - Controller");
    }

   /* public ProductController() {

    }*/

 /*   @PostConstruct // odpal po stworzeniu beana
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaki produkt chcesz dodać?");
        String name = scanner.nextLine();
        Product product = new Product(name);
        System.out.println("Twój produkt to: " + product);
        productService.addProduct(product);
    }*/

    //metoda która zostanie wywołana gdy przyjdzie zapytanie http do serwera z taką ścieżką i typu POST.
    //z ciała zapytania w formacie JSON zostanie stowrzony obiekt Product
    //Klasa product musi w tym celu mieć bezparametrowy konstruktor, zgodność nazw pól z JSONem oraz gettery do wszystkich pól (settery niekoniecznie)

    //@RequestMapping(path = "/api/v1/products" , method = RequestMethod.POST)
    @PostMapping("/api/v1/products")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }



}
