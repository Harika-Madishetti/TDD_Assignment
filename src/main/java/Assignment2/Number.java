package Assignment2;

public class Number {
    private static final int DIVISOR = 2;
    private static final int REMAINDER = 0;

    public boolean check(int givennumber) {
        for(int divisor = DIVISOR ; divisor < givennumber; divisor++ ){
           if(givennumber % divisor == REMAINDER )
            return false;
        }
        return true;
    }
}
