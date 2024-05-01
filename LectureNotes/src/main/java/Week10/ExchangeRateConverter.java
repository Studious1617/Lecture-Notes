package Week10;

import kong.unirest.Unirest;

import java.util.Map;

import static input.InputUtils.doubleInput;

public class ExchangeRateConverter {
    public static void main(String[] args){
        String url = "https://1150-exchange-rates.azurewebsites.net/latest";
        Map<String, Object> queryParameters = Map.of("base", "USD", "symbols", "EUR");

        RateResponse response = Unirest.get(url)
                .queryString(queryParameters)
                .asObject(RateResponse.class)
                .getBody();

        String dateRequested = response.date;
        double rate = response.rates.EUR;
        double amountOfDollars = doubleInput("How many US Dollars to convert to Euros? ");
        double euroEquivalent = amountOfDollars * rate;
        System.out.println("On " + dateRequested + " the exchange rate from USD to Euros is " + rate);
        System.out.printf("$%.2f is equivalent to %.2f Euros.", amountOfDollars, euroEquivalent);
    }
}

class RateResponse {
    public String base;
    public String date;
    public Rates rates;
}

class Rates {
    public double EUR;
}
