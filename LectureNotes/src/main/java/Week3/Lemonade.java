package Week3;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class Lemonade {
    public static void main(String[] args) {
        //Calculate operating cost and profit for a lemonade stand
        //The lemonade stand sells lemonade and cookies

        //To calculate profit we need to know how much was spent on lemonade supplies and what one cup of lemonade sold for and the number of cups sold
        double lemonadeProfit = calculateProfitForProduct("Lemonade");
        System.out.println("Lemonade profit = $" + lemonadeProfit);

        //Do some calculation for cookies

        //To calculate profit and need to know how much was spent on cookie supplies and what one cookie sold for and the number of cookies sold
        double cookieProfit = calculateProfitForProduct("cookies");
        System.out.println("Cookie profit = $" + cookieProfit);

        double coffeeProfit = calculateProfitForProduct("coffee");
        System.out.println("Coffee profit = $" + coffeeProfit);

        double sodaProfit = calculateProfitForProduct("soda");
        System.out.println("Soda profit = $" + sodaProfit);
    }

    public static double calculateProfitForProduct(String productName){
        double suppliesCost = doubleInput("How much did you spend on " + productName + " supplies?: ");
        double salePrice = doubleInput("What did you sell one " + productName + " for?: ");
        int numberSold = intInput("How many " + productName + " did you sell?: ");

        //Calculate profit
        double profit = (numberSold * salePrice) - suppliesCost;
        return profit;
    }
}
