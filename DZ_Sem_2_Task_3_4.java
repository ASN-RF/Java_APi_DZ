public class DZ_Sem_2_Task_3_4 {
    public static void main(String[] args) {
        String stroka = "a".repeat(1000);
        long start = System.currentTimeMillis();
        String Stroka_New = stroka.replace("a", "A");
        System.out.println(Stroka_New);
        System.out.println("String time = " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        StringBuilder stroka_2 = new StringBuilder(stroka);
        stroka_2 = stroka_2.replace(0, stroka_2.length(), stroka_2.toString().replace("a", "A"));
        System.out.println(stroka_2);
        System.out.println("Stringbilder time = " + (System.currentTimeMillis() - start));
    }
}
