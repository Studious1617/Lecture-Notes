package Week10;

import kong.unirest.Unirest;
import kong.unirest.UnirestException;

public class CatFactAPI {
    public static void main(String[] args) {
        try {
            String url = "https://catfact.ninja/fact";
            CatFact catFact = Unirest.get(url).asObject(CatFact.class).getBody();
            if (catFact != null) {
                String fact = catFact.fact;
                System.out.println("One fact about cats is as follows: \n" + fact);
                int factLength = catFact.length;
                System.out.println("This fact is " + factLength + " characters long.");
            }
            else {
                System.out.println("Could not get cat fact from website because CatFact is null.");
            }
        } catch (UnirestException uE){
            System.out.println("Could not get cat fact from website because " + uE);
        }
    }
}

class CatFact {
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
