package com.cruncher;

public class NumberCruncher {
    private final int[] numbers;

    protected int crunch(Cruncher cruncher){
        int count = 0;
        for (int number : numbers) {
            if (cruncher.check(number)) count++;
        }
        return count;
    }

    public NumberCruncher(int... numbers) {
        this.numbers = numbers;
    }

    public int countEven() {
        return crunch(new EvenCruncher());
    }

    public int countOdd() {
        return crunch(new OddCruncher());
    }

    public int countPositive() {
        return crunch(new PositiveCruncher());
    }

    public int countNegative() {
        return crunch(new NegativeCruncher());
    }
}

