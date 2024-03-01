package Week3;

import java.util.Arrays;

public class CorporateSponsors {
    public static void main(String[] args) {

        // Modify array, make string uppercase
        String[] sponsers = {"ikea", "at&t", "cvs", "3m"};

        for (int i = 0; i < sponsers.length; i++){
            // Faster and more concise given solution
            sponsers[i] = sponsers[i].toUpperCase();

            // Clearer solution, more legible
            //String sponser = sponsers[i];
            //sponser = sponser.toUpperCase();
            //sponsers[i] = sponser;
        }

        System.out.println(Arrays.toString(sponsers));





    }
}
