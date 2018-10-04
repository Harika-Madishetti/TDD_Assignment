package FibonacciSeries;

public class FibonacciSeries {
    public int get(int i) {
        if(i < 2) {
            return 1;
        }
        return get(i - 1) + get(i - 2);
    }
}
