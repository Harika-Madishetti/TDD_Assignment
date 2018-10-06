package Assignment2;

public class Primenumber {

    public boolean check(int number) {
        for(int j = 2 ; j < number; j++){
           if(number % j == 0 )
            return false;
        }
        return true;
    }
}
