package com.cruncher;

public class EvenCruncher implements Cruncher {

    @Override
    public boolean check(int number) {
        return number % 2 == 0;
    }
}
