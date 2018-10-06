package Assignment2;

public class FibonacciSeries {
    private static final int TWO = 2;
    private static final int ONE = 1;

    public int get(int index) {
        if(index < TWO) {
            return ONE;
        }
        return get(index - ONE) + get(index - TWO);
    }
}
