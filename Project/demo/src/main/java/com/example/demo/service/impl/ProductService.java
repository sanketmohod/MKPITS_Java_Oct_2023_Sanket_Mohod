package com.example.demo.service.impl;


import com.example.demo.dto.ProductDto;
import com.example.demo.dto.Products;
import com.example.demo.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Override
    public ProductDto getAllProducts(){

        ProductDto productDto = new ProductDto();

        Products products1 = new Products();
        products1.setId(1);
        products1.setName("Mobile");
        products1.setDescription("Smart Android Phones");
        products1.setPrice(10000.00);

        Products products2 = new Products();
        products2.setId(2);
        products2.setName("laptop");
        products2.setDescription("High Battery Backup");
        products2.setPrice(45000.00);

        Products products3 = new Products();
        products3.setId(3);
        products3.setName("LED TV");
        products3.setDescription("With Full HD Screen");
        products3.setPrice(22000.00);

        List<Products> productsDtoList = new ArrayList<>();
        productsDtoList.add(products1);
        productsDtoList.add(products2);
        productsDtoList.add(products3);

        productDto.setProducts(productsDtoList);
        return  productDto;
    }

}
