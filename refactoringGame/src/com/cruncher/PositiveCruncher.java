package com.cruncher;

public class PositiveCruncher implements Cruncher {
    @Override
    public boolean check(int number) {
        return number >= 0;
    }
}
