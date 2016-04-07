package com.cruncher;

public class NegativeCruncher implements Cruncher {

    @Override
    public boolean check(int number) {
        return number < 0;
    }
}
