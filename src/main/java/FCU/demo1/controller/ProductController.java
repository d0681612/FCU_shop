package FCU.demo1.controller;

import FCU.demo1.model.Product;
import FCU.demo1.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 產品控制.
 */
@RestController
public class ProductController {

  @Autowired
  ProductService productManager;

  @GetMapping("/Product")
  public List<Product> getProducts() {

    return productManager.getProducts();
  }

  public List<Product> searchProducts() {

    return productManager.getProducts();
  }
}
