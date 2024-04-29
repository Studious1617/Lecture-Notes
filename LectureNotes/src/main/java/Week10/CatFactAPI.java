package Week10;

import kong.unirest.Unirest;
public class CatFactAPI {
    public static void main(String[] args) {
        String url = "https://catfact.ninja/fact";
        CatFact catFact = Unirest.get(url).asObject(CatFact.class).getBody();
        String fact = catFact.fact;
        System.out.println("One fact about cats is as follows: \n" + fact);
        int factLength = catFact.length;
        System.out.println("This fact is " + factLength + " characters long.");
    }
}

class CatFact {
    public String fact;
    public int length;

    //The getters and setters below are used if one wants to have private fields
    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
