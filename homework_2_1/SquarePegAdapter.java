package homework_2_1;

public class SquarePegAdapter implements RoundPeg{

    private final double sideLength;

    public SquarePegAdapter(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow(sideLength, 2) + Math.pow(sideLength, 2));
    }
}
