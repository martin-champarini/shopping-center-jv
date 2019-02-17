package com.shopping.center.jv.shoppingcenterjv.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.center.jv.shoppingcenterjv.model.Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "product-controller", description = "All operation allowed")
public class ProductController {

    @PostMapping(value = "createProduct")
    @ApiOperation(value = "create product")
    public Product createProduct() {
        return null;
    }

}
