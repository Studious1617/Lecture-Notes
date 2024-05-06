package Week10;

import kong.unirest.Unirest;

import java.util.Map;

import static input.InputUtils.doubleInput;

public class ExchangeRateConverter {
    public static void main(String[] args){
        //Tells the program the site the information is located in
        String url = "https://1150-exchange-rates.azurewebsites.net/latest";
        //Makes a map of strings and objects that corespond with the api data
        Map<String, Object> queryParameters = Map.of("base", "USD", "symbols", "EUR");

        //The process for getting a response from the api
        RateResponse response = Unirest.get(url)
                .queryString(queryParameters)  //Gives the query / asks the query
                .asObject(RateResponse.class)
                .getBody();  //Transforms the response into a java
                // object of the RateResponse class

        //Stores the date of the response
        String dateRequested = response.date;
        //Stores the rate for USD to EUR
        double rate = response.rates.EUR;
        //Asks the user how much USD they want to convert to Euros
        double amountOfDollars = doubleInput("How many US Dollars to convert to Euros? ");
        //Conversion calculation
        double euroEquivalent = amountOfDollars * rate;
        //Tells the user the conversion amount current to the specific date that they asked
        System.out.println("On " + dateRequested + " the exchange rate from USD to Euros is " + rate);
        System.out.printf("$%.2f is equivalent to %.2f Euros.", amountOfDollars, euroEquivalent);
    }
}

class RateResponse {
    //Fields for RateResponse object
    public String base;
    public String date;
    public Rates rates;
}

class Rates {
    //Fields for Rates object
    public double EUR;
}
