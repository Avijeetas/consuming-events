package com.example.consumingevents.Service;

import com.example.consumingevents.model.Product;
import com.example.consumingevents.proxy.ProductProxy;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
@Service
public class ProductService {
    private final ProductProxy proxy;

    public ProductService(ProductProxy proxy) {
        this.proxy = proxy;
    }

    public Flux<Product> getAll(){
        return proxy.getAll();
    }
}
