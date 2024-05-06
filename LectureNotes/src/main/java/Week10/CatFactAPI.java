package Week10;

import kong.unirest.Unirest;
import kong.unirest.UnirestException;

public class CatFactAPI {
    public static void main(String[] args) {
        //Exception handling
        try {
            //Tells the program the site the information is located in
            String url = "https://catfact.ninja/fact";
            //The process for getting a response from the api
            CatFact catFact = Unirest.get(url).asObject(CatFact.class).getBody();
//            CatFact catFact = Unirest.get(url).header("accept", "application/json").asObject(CatFact.class).getBody();
            if (catFact != null) {
                String fact = catFact.fact;
                System.out.println("One fact about cats is as follows: \n" + fact);
                int factLength = catFact.length;
                System.out.println("This fact is " + factLength + " characters long.");
            }
            else {
                //Gives user an error message of sorts if the response from the api is null
                System.out.println("Could not get cat fact from website because CatFact is null.");
            }
        } catch (UnirestException uE){
            //Gives user an error message of sorts if a Unirest exception happens
            System.out.println("Could not get cat fact from website because " + uE);
        }
    }
}

class CatFact {
    //Fields for the CatFact object
    //We could use getters and setters but it's easier
    // to just use direct fields for this small program
    public String fact;
    public int length;

    //The getters and setters below are used if one wants to have private fields
//    public String getFact() {
//        return fact;
//    }
//
//    public void setFact(String fact) {
//        this.fact = fact;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
}
