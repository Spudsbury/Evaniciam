package com.company;

/**
 * Created by corbot on 2/27/2016.
 */
public class Constitution {

    private int stat;

    public Constitution( ) {
        this.stat = 8;
    }

    public int getStat() {
        return stat;
    }

    public int levelUp(int operand){
        return this.stat += operand;
    }
}
