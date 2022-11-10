package guru.springframework.msscbeerservice.services;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.web.model.BeerPagedList;
import guru.springframework.msscbeerservice.web.model.BeerStyle;
import org.springframework.data.domain.PageRequest;

public interface BeerService {

    BeerPagedList listBeers(String beerName, BeerStyle beerStyle, PageRequest pageRequest);

    public BeerDto getBeer(String beerId);

    public BeerDto saveNewBeer(BeerDto beerDto);

    public BeerDto updateBeer(String beerId, BeerDto beerDto);
}
