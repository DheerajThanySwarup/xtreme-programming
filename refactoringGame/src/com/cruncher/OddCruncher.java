package com.cruncher;

public class OddCruncher implements Cruncher {

    @Override
    public boolean check(int number) {
        return number % 2 == 1;
    }
}
