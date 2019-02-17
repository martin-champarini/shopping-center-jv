package com.shopping.center.jv.shoppingcenterjv.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.center.jv.shoppingcenterjv.model.Country;
import com.shopping.center.jv.shoppingcenterjv.service.CountryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="country-controller", description="All operation allowed")
public class CountryController {

    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @PutMapping(value = "addCountry")
    @ApiOperation(value = "Add Country And City")
    public Country saveCountry() {
        return countryService.saveCountry();
    }

}
