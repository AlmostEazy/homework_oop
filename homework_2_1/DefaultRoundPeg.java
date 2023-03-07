package homework_2_1;

public class DefaultRoundPeg implements RoundPeg {

    private final double radius;

    DefaultRoundPeg(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

}
