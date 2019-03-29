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
        int[] output = new int[data.length];

        for(int i = 0; i < data.length; i++){
            if(data[i] == val1)
                output[i] = val2;
            else
                output[i] = data[1];
        }

        return output;
    }

    public static int[] padZeros(int [] data){
        int[] output = new int[data.length];
        int[] zeros;
        int[] others;

        for(int i = 0; i< data.length; i++){
            if(data[i] == 0)
                zeros[i] = 0;
            else
                others[i] = data[i];
        }


        return output;
    }
}
