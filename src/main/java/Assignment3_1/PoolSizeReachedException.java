package Assignment3_1;

public class PoolSizeReachedException extends Exception {
       private String message = "Pool Size Reached";
       public String toString(){
           return message;
       }
}
