package cisc181.Lab_0;

/*
Aaron Knestaut
Cisc 181-012
 */

public class Lab_0 {
    public static double celsius_to_fahrenheit(double cdeg) {
        return 32.0 + (cdeg * 1.8);
    }

    public static void main(String args[]){
        System.out.println("Test");

        System.out.println(5 + 10);

        double LBS_TO_KILO = 0.45359237;
        System.out.println(175 * LBS_TO_KILO);

        int age = 19;
        System.out.println(age);
        age = age + 1;
        System.out.println(age);

        int JOE_AGE = 25;
        if (JOE_AGE < 18) {
            System.out.println("minor");
        }
        else if (JOE_AGE < 65) {
            System.out.println("adult");
        }
        else {
            System.out.println("senior");
        }

        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += i;
        }
        System.out.println(total);

        int guess = 1;
        while (guess % 7 != 0) {
            guess = new java.util.Random().nextInt(100);
        }
        System.out.println(guess);

        System.out.println(celsius_to_fahrenheit(25.0));
    }
}
