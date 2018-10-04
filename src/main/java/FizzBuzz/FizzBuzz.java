package FizzBuzz;

public class FizzBuzz {
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int ZERO = 0;
    private static final String BLANK = "";

    public String print(int number) {
        if(number % THREE == ZERO && number % FIVE == ZERO) {
            return "FIZZBUZZ";
        }else if(number % THREE == ZERO){
            return "FIZZ";
        }else if(number % FIVE == ZERO){
            return  "BUZZ";
        }
        return  BLANK + number;
    }
}
