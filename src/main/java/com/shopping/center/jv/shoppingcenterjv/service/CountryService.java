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
        Country argentina = new Country();
        argentina.setName("Argentina");
        City cordoba = new City();
        cordoba.setName("Cordoba");
        cordoba.setCountry(argentina);
        argentina.setCities(Sets.newHashSet(cordoba));
        //FIXME this return is throwing stackoverflow onto CountryController
        return countryRepository.save(argentina);
    }
}
