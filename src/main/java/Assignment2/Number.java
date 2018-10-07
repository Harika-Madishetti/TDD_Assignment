package Assignment2;

public class Number {

    public static boolean isprime(int input) {
        if(input <= 1) {
            return false;
        }
        for(int number = 2;number<input;number++){
                if(input % number == 0){
                    return false;
                }
            }
            return true;
    }
}