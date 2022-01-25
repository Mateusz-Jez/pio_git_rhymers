package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    final private int SIZE = 12;
    final private int EMPTY_STACK_VALUE = -1;

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_STACK_VALUE;
    private final int[] numbers = new int[SIZE];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == SIZE-1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }

}
