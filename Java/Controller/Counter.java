package Controller;

public class Counter implements AutoCloseable  {
    private int sum;
    public void add() {
        sum++;
    }

    public int getCount() {
        return sum;
    }

    public void resetCount() {
        sum = 0;
    }

    @Override
    public void close() throws Exception {
        if (getCount() == 0) {
            throw new Exception("Counter was not used in try-with-resources block");
        } else {
            resetCount();
        }
    }
}
