package cisc181.Lab_1;

/**
 * Aaron Knestaut
 * Cisc 181-012
 */

public class Lab_1 {
    /*
    Takes in 3 doubles representing side lengths for a scalene triangle,
    and uses the formula for the area of a scalene triangle to return the area
     */
    public static double areaScalene(double a, double b, double c){
        double semiPer = (a + b + c) / 2;
        double area = Math.sqrt(semiPer * (semiPer - a) * (semiPer - b) * (semiPer - c));

        return area;
    }

    /*
    Takes in the number of rounds played and the number of points,
    and determines how many levels to increase the next one by
     */
    public static int increaseLevel(int numRounds, int numPoints){
        if(numRounds < 5 && numPoints < 10){
            return 0;
        }
        else if(numRounds < 5 && (numPoints >= 10 && numPoints <= 20)){
            return 1;
        }
        else if(numPoints > 20){
            return 2;
        }
        else if(numRounds >= 5 && numPoints < 6){
            return 0;
        }
        else{
            return 1;
        }
    }

    /*
    Takes in two numbers between 10 and 99 and sees if  they share
    a digit, and returns true or false
     */
    public static boolean shareDigit(int num1, int num2){
        int left1 = num1 / 10;
        int right1 = num1 % 10;
        int left2 = num2 / 10;
        int right2 = num2 % 2;

        return left1 == left2 || left1 == right2 || right1 == left2 || right1 == right2;
    }

    /*
    Takes in a whole number and tries to find the closest smaller
    factor to that number
     */
    public static int closestFactorToSqrt(int num){
        int factor = (int)(Math.sqrt(num));

        while((num % factor) != 0){
            factor -= 1;
        }
        return factor;
    }

    /*
     * Scoring rule for a simple dice game.
     *  3 of a kind – score 25
     *  2 of a kind –  add the dice
     * otherwise score is the largest die roll
     */
    public static int score(int d1, int d2, int d3) {
        if (d1 == d2 && d2 == d3) {
            return 25;
        }
        else if (d1 == d2 || d2 == d3 || d1 == d3) {
            return d1 + d2 + d3;
        }
        else {
            return Math.max(Math.max(d1, d2), d3);
        }
    }

    /*
    Returns a random score from a 3 dice roll
     */
    public static int scoreTurn(){
        int d1 = (int)(Math.random()*6) + 1;
        int d2 = (int)(Math.random()*6) + 1;
        int d3 = (int)(Math.random()*6) + 1;

        return score(d1, d2, d3);
    }

    /*
    Takes in a number of turns and returns a value
    that is the average score of all those rolls
     */
    public static double simulate(int rolls){
        int count = 0;
        double sum = 0;

        while(count != rolls){
            sum += scoreTurn();
            count++;
        }

        return sum / rolls;
    }

    /*
    Just spits out some info for each method and their results
     */
    public static void main(String args[]){
        //Part A
        System.out.println("a: 5.5 b: 3.4 c: 8.7 Area: " + areaScalene(5.5, 3.4, 8.7));

        //Part B
        System.out.println("Rounds: 1 Points: 1 Increase by: " + increaseLevel(1, 1));
        System.out.println("Rounds: 1 Points: 25 Increase by: " + increaseLevel(1, 25));
        System.out.println("Rounds: 3 Points: 15 Increase by: " + increaseLevel(3, 15));

        //Part C
        System.out.println("Num 1: 15 Num 2: 57 Result: " + shareDigit(15, 57));
        System.out.println("Num 1: 20 Num 2: 22 Result: " + shareDigit(20, 22));
        System.out.println("Num 1: 15 Num 2: 40 Result: " + shareDigit(15, 40));

        //Part D
        System.out.println("Num: 1 Factor: " + closestFactorToSqrt(1));
        System.out.println("Num: 4 Factor: " + closestFactorToSqrt(4));
        System.out.println("Num: 10 Factor: " + closestFactorToSqrt(10));
        System.out.println("Num: 70 Factor: " + closestFactorToSqrt(70));
        System.out.println("Num: 1427 Factor: " + closestFactorToSqrt(1427));

        //Part E
        System.out.println("Avg of 2 rolls: " + simulate(2));
        System.out.println("Avg of 10 rolls: " + simulate(10));
        System.out.println("Avg of 100000 rolls: " + simulate(100000));
    }
}
