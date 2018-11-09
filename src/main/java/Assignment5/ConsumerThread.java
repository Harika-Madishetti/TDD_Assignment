package Assignment5;

public class ConsumerThread {
    private long lastThreadId = 0;

    public boolean isSelfish(long currentThread) {
        if (lastThreadId == currentThread) {
            return true;
        } else
            lastThreadId = currentThread;
        return false;
    }
}
