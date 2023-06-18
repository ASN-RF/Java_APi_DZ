
// Домашнее задание 1.
import java.util.Random;
import java.util.Arrays;

public class DZ_Sem_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //Задание 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i.
        // 1 вариант
        System.out.println("Задание 1. Решение:");
        int i = new Random().nextInt(2000); // либо можно: int k = 2000 и тогда int i = new Random().nextInt(k);
        System.out.println("1 вариант -> " + i);
        // 2 вариант
        Random random = new Random();
        int m = random.nextInt(2000);
        System.out.println("2 вариант -> " + m);
        System.out.println();

        //Задание 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа.
        // 1 вариант
        System.out.println("Задание 2. Решение:");
        int n = 0;
        int count = i;
        while (count !=0){
            count = count >> 1;
            n++;
        }
        System.out.println("1 вариант (i = " + i + ")");
        System.out.println("Номер старшего значащего бита  n выпавшего числа i (i = " + i + ") = " + n);

        // 2 вариант
        System.out.println("2 вариант (i = " + i + ")");
        int y = Integer.toBinaryString(i).length();
        System.out.println("Номер старшего значащего бита n выпавшего числа i (i = " + i + ") = " + y);
        System.out.println();

        //Задание 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1.
        System.out.println("Задание 3. Решение:");
        System.out.println("Дано: n = " + n);
        System.out.println("Диапазон: от " + i + " до " + Short.MAX_VALUE);
        // Определяем длину массива
        int dlina_m1 = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                dlina_m1++;
            }
        }
        // Создаем и заполнямем массив м1
        int [] m1 = new int [dlina_m1];
        int index_m1 = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[index_m1] = j;
                index_m1++; 
            }
        }
        // Выводим в консоль массив м1 (1 вариант)
        /*for (int l = 0; l <= dlina_m1; l++) {
            System.out.print(m1[l] + ", ");
        }*/
        System.out.println("Длина массива: " + m1.length); 
        //System.out.println(Arrays.toString(m1));
        System.out.println();

        // Задание 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2.
        System.out.println("Задание 4. Решение:");
        System.out.println("Дано: n = " + n);
        System.out.println("Диапазон: от " + Short.MIN_VALUE + " до " + i);
        // Определяем длину массива
        // 1 вариант  - длина массива
        int dlina_m2 = 0;
        for (int j = i; j > Short.MIN_VALUE; j--) {
            if (j % n != 0) {
                dlina_m2++;
            }
        }
        // 2 вариант - длина массива
       /*  int dlina_m3 = 0;
        for (int l = Short.MIN_VALUE; l < i; l++) {
            if (l % n != 0) {
                dlina_m3++;
            }
        } */

        // Создаем и заполнямем массив м2
        int [] m2 = new int [dlina_m2];
        int index_m2 = 0;
        for (int j = i; j > Short.MIN_VALUE; j--) {
            if (j % n != 0) {
                m2[index_m2] = j;
                index_m2++; 
            }
        }
        // Выводим в консоль массив м2
        System.out.println("Длина массива: " + m2.length); 
       // System.out.println(Arrays.toString(m2));  
    }
}