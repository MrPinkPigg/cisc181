/**
 * Aaron Knestaut
 * Cisc 181
 */

package cisc181.Lab_5;

public class ArrayStaticMethods {
    /*
    takes an array and finds the mean of all the values
     */
    public static double mean(double [] data){
        double sum = 0;

        for(int i = 0; i < data.length; i++){
            sum += data[i];
        }

        return sum / data.length;
    }

    /*
    takes an array and finds how many lowercase or uppercase m's appear
     */
    public static int countM(char [] data){
        int count = 0;

        for(int i = 0; i < data.length; i++){
            if(data[i] == 'm' || data[i] == 'M')
                count++;
        }

        return count;
    }

    /*
    takes an array and two vals, and creates an identical array with all data of val1 replaced with val2
     */
    public static int[] replace(int [] data, int val1, int val2){
        for(int i = 0; i < data.length; i++){
            if(data[i] == val1)
                data[i] = val2;
        }

        return data;
    }

    /*
    takes an array of ints and puts all zeros at the front

    its not very pretty
     */
    public static int[] padZeros(int [] data){
        int[] output = new int[data.length];
        int zeros = 0;

        for(int i = 0; i < data.length; i++){
            if(data[i] == 0)
                zeros++;
        }
        for(int i = 0; i < zeros; i++) {
            output[i] = 0;
        }
        int curr = zeros;
        for(int i = 0; i < data.length; i++){
            if(data[i] != 0) {
                output[curr] = data[i];
                curr++;
            }
        }

        return output;
    }
}
