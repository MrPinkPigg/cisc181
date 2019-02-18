package cisc181.Lab_0;

/*
Aaron Knestaut
Cisc 181-012
 */

public class Lab_0D {
    public static void main(String args[]){
        System.out.println(computeTax(30000, 2, false));
        System.out.println(computeTax(10000, 6, false));
        System.out.println(computeTax(75000, 1, false));
        System.out.println(computeTax(75000, 1, true));

        System.out.println(grossIncome(30000, 2, false));
        System.out.println(grossIncome(10000, 6, false));
        System.out.println(grossIncome(75000, 1, false));
        System.out.println(grossIncome(75000, 1, true));
    }

    /*
    Computes amount of tax owed for a given income, num of exemptions, and non-profit status
     */
    public static double computeTax(int income, int exemptions, boolean nonProfit){
        int adjustedIncome = income - exemptions * 5000;

        if (nonProfit == true ^ adjustedIncome < 0) {
            return 0;
        }
        else if (adjustedIncome < 10000){
            return adjustedIncome * .1;
        }
        else if (adjustedIncome < 20000){
            return adjustedIncome * .15;
        }
        else if (adjustedIncome < 50000){
            return adjustedIncome * .2;
        }
        else{
            return adjustedIncome * .25;
        }
    }

    /*
    Computes the gross income (taking taxes into account) for a given income,
    num of exemptions, and non-profit status
     */
    public static double grossIncome(int income, int exemptions, boolean nonProfit){
        return income - computeTax(income, exemptions, nonProfit);
    }
}
