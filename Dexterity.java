package Evanaciam;

/**
 * Created by corbot on 2/27/2016.
 */
public class Dexterity {
    private int stat;

    public Dexterity() {
        this.stat = 8;
    }

    public int getStat() {
        return stat;
    }

    public int levelUp(int operand){
        return this.stat += operand;
    }
}
