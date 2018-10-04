package FizzBuzz;

public class FizzBuzz {
    private static final String FIZZ = "FIZZ";
    private static final int THREE = 3;
    private static final String BLANK = "";

    public String print(int number) {
        if(number % THREE == 0 && number % 5 ==0) {
            return "FIZZBUZZ";
        }else if(number % THREE == 0){
            return "FIZZ";
        }else if(number % 5 ==0){
            return  "BUZZ";
        }
        return  BLANK + number;
    }
}
