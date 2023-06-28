import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

// Задача 1. Пусть дан произвольный список из 100 целых чисел. 
            // 1) Нужно удалить из него чётные числа
            // 2) Найти минимальное значение
            // 3) Найти максимальное значение
            // 4) Найти среднее значение

public class DZ_Sem_3 {

    public static void main(String[] args) {
        // Пусть дан произвольный список
        ArrayList <Integer> array1 = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            array1.add(new Random().nextInt(1,99));
        }
        
        System.out.println("Cписок: " + array1);
        RemEvenNumbers(array1); // 1) Нужно удалить из него чётные числа
        SearchForMIN_2(array1);  // 2,3.4
    }
    public static ArrayList<Integer> RemEvenNumbers(ArrayList<Integer> array) {
        ArrayList<Integer> array2 = new ArrayList<>();
        for (Integer i : array) {
            if (i % 2 != 0) array2.add(i);
        }
        System.out.println("Cписок БЕЗ четных чисел: " + array2);
        return array2;
    }
    public static void SearchForMIN_2(ArrayList<Integer> array) {    
        Collections.sort(array);
        System.out.println("Минимальное значение после метода сортировки: " + array.get(0));
        System.out.println("Максимальное значение после метода сортировки: " + array.get(array.size() - 1));
        int min = array.get(0);
        int sum = 0;
        int avg = 0;
        for (Integer i : array) {
            if (i < min) min = i;
            sum += i;
            avg = sum / array.size();
        }
        
        System.out.println("Максимальное значение (Collections): " + Collections.max(array));
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + avg);
    }
}