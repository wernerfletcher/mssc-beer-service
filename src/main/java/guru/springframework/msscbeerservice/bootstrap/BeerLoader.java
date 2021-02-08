package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadSomeBeers();
    }

    private void loadSomeBeers() {
        beerRepository.save(Beer.builder()
                .beerName("Castle")
                .beerStyle("LAGER")
                .upc(100000000000L)
                .quantityToBrew(100)
                .minOnHand(25)
                .price(new BigDecimal("25.95"))
                .build());

        beerRepository.save(Beer.builder()
                .beerName("Black Label")
                .beerStyle("BEER")
                .upc(100000000001L)
                .quantityToBrew(100)
                .minOnHand(25)
                .price(new BigDecimal("25.95"))
                .build());
    }

}
