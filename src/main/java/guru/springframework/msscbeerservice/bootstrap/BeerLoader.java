package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

//@Component
public class BeerLoader implements CommandLineRunner {

    public static final String UPC_1 = "100000000000";
    public static final String UPC_2 = "100000000001";
    public static final String UPC_3 = "100000000002";

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
                .upc(UPC_1)
                .quantityToBrew(100)
                .minOnHand(25)
                .price(new BigDecimal("24.95"))
                .build());

        beerRepository.save(Beer.builder()
                .beerName("Black Label")
                .beerStyle("BEER")
                .upc(UPC_2)
                .quantityToBrew(100)
                .minOnHand(25)
                .price(new BigDecimal("25.95"))
                .build());

        beerRepository.save(Beer.builder()
                .beerName("Budweiser")
                .beerStyle("BEER")
                .upc(UPC_3)
                .quantityToBrew(100)
                .minOnHand(25)
                .price(new BigDecimal("26.95"))
                .build());
    }

}
