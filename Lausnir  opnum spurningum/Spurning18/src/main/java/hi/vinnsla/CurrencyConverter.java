package hi.vinnsla;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Currency;
import java.util.HashMap;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : 
 *
 *
 *****************************************************************************/
public class CurrencyConverter {

    // TODO define an array, a list or a hashmap for the currencies of USD and EUR

    private final HashMap<String, Double> currencies;

    private final String [] currenciesArray = {"USD", "EUR"};

    public CurrencyConverter() {

        // TODO initialize the chosen data structures for currencies and optionally their values
        currencies = new HashMap<>();
        currencies.put("USD", 127.61);
        currencies.put("EUR", 144.91);
    }

    public ObservableList<String> getCurrencies() {

        // TODO return an observable list of currency names, i.e. USD and EUR
           return FXCollections.observableArrayList(currenciesArray);
           // eða
          // return FXCollections.observableArrayList(currencies.keySet());
    }

    public double convertToISK(double amount, String currency) {
        // TODO: Implement conversion logic
        return amount * currencies.get(currency);
    }
}
