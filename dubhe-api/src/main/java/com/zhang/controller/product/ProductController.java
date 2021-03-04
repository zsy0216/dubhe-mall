package com.zhang.controller.product;

import com.zhang.product.mapper.ProductMapper;
import com.zhang.product.model.Product;
import com.zhang.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhangshuaiyin
 * @date: 2021/3/2 16:37
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductMapper productMapper;

    @GetMapping
    public Result getProductList() {
        List<Product> products = productMapper.selectList(null);
        return Result.success(products);
    }

}
