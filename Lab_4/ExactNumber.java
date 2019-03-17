package cisc181.Lab_4;

/**
 * Aaron Knestaut
 * Cisc181-012
 */

public class ExactNumber {
    static final long DENOMINATOR = 10000000000000000L;

    private long left;
    private long right;

    /*
    constructor for an ExactNumber
     */
    public ExactNumber(long left, long right){
        this.left = left;
        this.right = right;
    }

    /*
    determines the non-long version of an ExactNumber
     */
    public double doubleValue(){
        return (double) this.left + ((double) this.right / (double) DENOMINATOR);
    }

    /*
    main method
     */
    public static void main(String args[]){
        ExactNumber num = new ExactNumber(600,1250000000000000L);
        System.out.println(num.toString());
    }

    /*
    overrides toString() to implement doubleValue()
     */
    @Override
    public String toString() {
        return String.valueOf(doubleValue());
    }

    /*
    overrides equals() and returns a boolean for if
    left and right are equal
     */
    //@Override
    public boolean equals(ExactNumber otherNum) {
        if(this.left == otherNum.left && this.right ==  otherNum.right){
            return true;
        }
        else{
            return false;
        }
    }

    /*
    takes two ExactNumbers and determines if one is larger than the other
     */
    public int compareTo(ExactNumber otherNum){
        if(this.equals(otherNum)){
            return 0;
        }
        else if(this.left > otherNum.left){
            return 1;

        }
        else if(this.left == otherNum.left && this.right > otherNum.right){
            return 1;
        }
        else{
            return -1;
        }
    }

    /*
    takes two ExactNumbers and adds them together into a new ExactNumber
     */
    public ExactNumber add(ExactNumber otherNum){ //man ya lost me with this one tbh
        if(this.right + otherNum.right >= 9999999999999999L){
            return new ExactNumber(this.left + otherNum.left + 1, this.right + otherNum.right - 1000000000000000L);
        }

        return new ExactNumber(this.left + otherNum.left, this.right + otherNum.right);
    }
}
