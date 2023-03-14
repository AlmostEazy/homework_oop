package homework_4;

public class HomeWorkMain {

    public static void main(String[] args) {
        // Fruit <- Orange, Apple <- GoldenApple

        // Нужно реализовать хранение фрукто в коробке Box:
        // По-умолчанию коробка пустая. Можно класть только фрукты какого-то вида!
        // Нужно уметь получать сумарный вес всех фруктов в коробке
        // Нужно уметь пересыпать все фрукты из одной коробки в другую

        //Box<String> stringBox = new Box<>(); // Не должно работать!

        Box<Fruit> box = new Box();
        box.add(new Orange(2.3));
        box.add(new GoldenApple(1));
        box.add(new Apple(4));
        System.out.println("Коробка со всеми фруктами: ");
        box.getWeight();

        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(3.0));
        appleBox.add(new Apple(2.0));
        appleBox.add(new GoldenApple(1.0));
        //appleBox.add(new Orange(2.0)); // Не должно работать!
        System.out.println("Коробка со всеми яблоками: ");
        appleBox.getWeight(); // 6.0

        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(2.0));
        //goldenAppleBox.add(new Apple(2.0)); // Не должно работать
        System.out.println("Коробка с яблоками Golden: ");
        goldenAppleBox.getWeight();

        //appleBox.moveTo(goldenAppleBox); // Не должно работать!
        goldenAppleBox.moveTo(appleBox);
        System.out.println("Общая коробка с яблоками, после добавления яблок Golden: ");
        appleBox.getWeight(); // 8.0
        System.out.println("Коробка с яблоками Golden после извлечения яблок: ");
        goldenAppleBox.getWeight(); // 0.0

    }

}
