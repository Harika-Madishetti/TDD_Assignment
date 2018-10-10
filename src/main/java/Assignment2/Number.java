package Assignment2;

public class Number {
    int input;
    Number(int input){
        this.input = input;
    }
    public boolean isprime() {
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