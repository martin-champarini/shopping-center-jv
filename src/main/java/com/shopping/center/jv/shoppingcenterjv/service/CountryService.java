package com.shopping.center.jv.shoppingcenterjv.service;

import org.springframework.stereotype.Service;

import com.google.common.collect.Sets;
import com.shopping.center.jv.shoppingcenterjv.model.City;
import com.shopping.center.jv.shoppingcenterjv.model.Country;
import com.shopping.center.jv.shoppingcenterjv.repository.CountryRepository;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService(CountryRepository repository) {

        countryRepository = repository;
    }

    public Country saveCountry() {
        City cordoba = new City();
        Country argentina = new Country();
        argentina.setName("Argentina");
        cordoba.setName("Cordoba");

        argentina.setCities(Sets.newHashSet(cordoba));
        cordoba.setCountry(argentina);

        return countryRepository.save(argentina);
    }
}
