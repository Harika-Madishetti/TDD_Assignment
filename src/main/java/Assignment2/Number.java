package Assignment2;

public class Number {

    public boolean check(int givennumber) {
        for(int number = 2 ; number < givennumber; number++ ){
           if(givennumber % number == 0 )
            return false;
        }
        return true;
    }
}
