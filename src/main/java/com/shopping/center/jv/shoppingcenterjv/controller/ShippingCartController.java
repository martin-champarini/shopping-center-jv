package com.shopping.center.jv.shoppingcenterjv.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.center.jv.shoppingcenterjv.model.ShippingCart;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "shippingcart-controller", description = "All operation allowed")
public class ShippingCartController {


    @PostMapping(value = "createShippingCart")
    @ApiOperation(value = "create ShippingCart")
    public ShippingCart createOrder(){
        return null;
    }
}
