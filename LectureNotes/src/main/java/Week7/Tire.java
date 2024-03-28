package Week7;

public class Tire implements Comparable<Tire> {

    //Fields
    private String name;
    private double price;
    private int warrantyMiles;

    //Constuctor
    public Tire(String name, double price, int warrantyMiles){  //Input descriptions for calls
        this.name = name;
        this.price = price;
        this.warrantyMiles = warrantyMiles;
    }

    //Instance for calculating the price of a tire per 1000 miles
    public double pricePer1000Miles(){
        double pricePer1000 = (this.price / warrantyMiles) * 1000;  //The pricePer1000 miles is equal to the
        // price of this tire divided by the warrantyMiles and multiplied by 1000
        return pricePer1000;  //Returns the price per 1000 miles
    }

    //Instance for calculating the cost per set
    public double costForSet(){
        return this.price * 4;
    }

    @Override  //Overrides the original toString() method
    public String toString(){
        double pricePer1000 = this.pricePer1000Miles();  //Stores the value in this.pricePer1000Miles() in pricePer1000
        //Formatting for tire descriptions
        return String.format("%s costs $%.2f per tire. Cost per 1000 miles is $%.2f.", this.name, this.price, pricePer1000);
        //Return "This tire is called " + name;
    }

    @Override  //Overrides the original compareTo() method
    public int compareTo(Tire anotherTire){
        //return Double.compare(this.pricePer1000Miles(), anotherTire.pricePer1000Miles());  //<-- One way to compare the tires
        return this.name.compareTo(anotherTire.name);  //<-- Another way to compare them
    }
}
