package Assignment2;

public class Number {
    private static final int DIVISOR = 2;
    private static final int REMAINDER = 0;

    public boolean check(int givennumber) {
        int divisor = DIVISOR;
        final boolean isDivisible = givennumber % divisor == REMAINDER;

        for( divisor = DIVISOR ; divisor < givennumber; divisor++ ){
            if(isDivisible)
            return false;
        }
        return true;
    }
}
