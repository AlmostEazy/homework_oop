package homework_7;

public class mainEmployee {
    public static void main(String[] args) {
        employee first = new employee("Иван", "Иванов", "Инженер", 50000);
        employee second = new employee("Иван", "Иванов", "Менеджер", 30000);
        employee third = new employee("Петр", "Петров", "Менеджер", 30000);

        System.out.println(first.equals(second));
        System.out.println(second.equals(third));
    }
}
