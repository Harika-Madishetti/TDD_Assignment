package Assignment2;

public class FizzBuzz {
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int ZERO = 0;
    private static final String BLANK = "";
    public String print(int number) {
        final boolean isNumberDivisibleByFifteen = number % THREE == 0 && number % 5 ==0;
        final boolean isNumberDivisibleByThree = number % THREE == 0 ;
        final boolean isNumberDivisibleByFive = number % FIVE == 0 ;
        if(isNumberDivisibleByFifteen) {
            return "FIZZBUZZ";
        }else if(isNumberDivisibleByThree){
            return "FIZZ";
        }else if(isNumberDivisibleByFive){
            return  "BUZZ";
        }
        return  BLANK + number;
    }
}
