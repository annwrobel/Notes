package pl.sda.calculator;

/**
 * Created by jakubwrabel on 14.01.2017.
 */
public class Add implements Operation {
    @Override
    public double eval(double x, double y) {
        return x + y;
    }
}
