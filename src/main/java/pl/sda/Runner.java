package pl.sda;

import pl.sda.enums.Brand;
import pl.sda.model.Notebook;

import java.math.BigDecimal;
import java.time.Year;
import java.util.HashSet;
import java.util.Set;

public class Runner {
    private final static Set<Notebook> notebooks = new HashSet<>();
    private static final Year YEAR_2000 = Year.of(2000);

    static {
        //to jest statyczny blok inicjalizacyjny, wykona sie tylko raz w calej aplikacji
        notebooks.add(new Notebook("Very old name", Brand.ACER, Year.of(1990), BigDecimal.valueOf(5.0), false));
        notebooks.add(new Notebook("L702", Brand.DELL, Year.of(2007), BigDecimal.valueOf(100.0), false));
        notebooks.add(new Notebook("XPS 15", Brand.DELL, Year.of(2018), BigDecimal.valueOf(10000.0), true));
        notebooks.add(new Notebook("Galaxy Book 12", Brand.SAMSUNG, Year.of(2016), BigDecimal.valueOf(3199.0), true));
        notebooks.add(new Notebook("MacBook Pro", Brand.APPLE, Year.of(2018), BigDecimal.valueOf(12099.0), true));
        notebooks.add(new Notebook("MacBook", Brand.APPLE, Year.of(2018), BigDecimal.valueOf(5000), true));
        notebooks.add(new Notebook("MacBook Air", Brand.APPLE, Year.of(2018), BigDecimal.valueOf(6000), true));
    }
    public void run() {
        /*
         * Bazując na liście notebooks zrób następujące zadania:
         * 1. Wyświetl tylko laptopy, które nie są marki DELL
         * 2. Wyświetl laptopy wyprodukowane po 2000
         * 3. Wyświetl laptopy, których nazwa ma mniej niż 5 znaków
         * 4. Wyświetl dostępne laptopy
         * 5. Zsumuj ceny wszystkie laptopów marki Dell
         * 6. Wylicz średnią cenę laptopów marki Apple
         * 7. Wyświetl laptopy, których marka ma więcej niż 4 znaki
         * 8. Wyświetl laptopy Apple, których cena jest mniejsza niż 1000 i są dostępne
         * * zrób to przy pomocy streamów jeśli już wiesz jak, jeśli nie, będę je wprowadzał
         */

    }
}
