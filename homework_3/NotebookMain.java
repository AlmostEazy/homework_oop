// Создать класс Notebook с полями (price(double), ram(int))
// 1. Сгенерировать список объектов типа Notebook с разными значениям price и ram
// 2. Релизовать 3 сортировки: 1 - по цене, 2 - по памяти, 3 - сначала по памяти, потом по цене
// 3. Отсортировать тремя способами стандартными средствами (Collections#sort или List#sort)

package homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class NotebookMain {
    public static void main(String[] args) {
    
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(33000, 4));
        notebooks.add(new Notebook(16000, 4));
        notebooks.add(new Notebook(26000, 8));
        notebooks.add(new Notebook(25000, 8));
        notebooks.add(new Notebook(44000, 16));
        notebooks.add(new Notebook(35000, 16));
        notebooks.add(new Notebook(43000, 32));
        notebooks.add(new Notebook(45000, 32));
        

        //Сортировка по цене

        Comparator<Notebook> PriceSorting = new PriceValueSorting();
        Collections.sort(notebooks, PriceSorting);
        for (Notebook notebook: notebooks) {
            notebook.printNotebook();
        }

        //Сортировка по памяти
        
        Collections.sort(notebooks, Comparator.comparingInt(Notebook::getRam));
        for (Notebook notebook: notebooks) {
            notebook.printNotebook();
        }

        //Сортировка сначала по памяти, потом по цене
        
        Collections.sort(notebooks, Comparator.comparingInt(Notebook::getRam)
                         .thenComparingDouble(Notebook::getPrice));
        for (Notebook notebook : notebooks) {
            notebook.printNotebook();
        }               
    }


    public static class Notebook {
        private double price;
        private int ram;

        public Notebook(double price, int ram) {
            this.price = price;
            this.ram = ram;
        }

        public double getPrice() {
            return price;
        }

        public int getRam() {
            return ram;
        }

        public String printNotebook() {
            System.out.println("Цена: " + price + "; Память: " + ram + ";");
            return null;
        }
    }

    //Класс сортировки по цене

    public static class PriceValueSorting implements Comparator<Notebook> {
        
        public int compare(Notebook o1, Notebook o2) {
            return (int) (o1.getPrice() - o2.getPrice());
        }
    }
}
