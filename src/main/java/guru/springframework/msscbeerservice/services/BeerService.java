package guru.springframework.msscbeerservice.services;

import guru.springframework.msscbeerservice.web.model.BeerDto;

public interface BeerService {

    public BeerDto getBeer(String beerId);

    public BeerDto saveNewBeer(BeerDto beerDto);

    public BeerDto updateBeer(String beerId, BeerDto beerDto);
}
