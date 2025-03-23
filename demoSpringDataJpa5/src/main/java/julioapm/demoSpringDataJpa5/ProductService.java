package julioapm.demoSpringDataJpa5;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Product updateProductPricePessimistic(long id, double newPrice) {
        Product product = productRepository.findByIdForUpdate(id).orElseThrow();
        product.setPrice(newPrice);
        return productRepository.save(product);
    }

    @Transactional
    public Product updateProductPriceOptimistic(long id, double newPrice) {
        Product product = productRepository.findById(id).orElseThrow();
        product.setPrice(newPrice);
        return productRepository.save(product);
    }

    @Transactional
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
