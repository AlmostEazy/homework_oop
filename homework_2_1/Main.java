package homework_2_1;

public class Main {
    public static void main(String[] args) {

        RoundPeg peg = new DefaultRoundPeg(2);
        RoundHoleMachine machine = new RoundHoleMachine();
        RoundHole hole = machine.makeHole(peg);
        System.out.println("Радиус круглого колышка: " + peg.getRadius());
        System.out.println("Диаметр отверстия круглого колышка: " + hole.getRadius() * 2);

        RoundPeg squarePeg = new SquarePegAdapter(2);
        RoundHole newHole = machine.makeHole(squarePeg);
        System.out.println("Радиус отверстия квадратного колышка: " + newHole.getRadius());

    }
}
