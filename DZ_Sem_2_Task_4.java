public class DZ_Sem_2_Task_4 {
    public static void main(String[] args) {
        getResultSting();      
    }
     public static String getResultSting() {
        String s = ".3 + 1.56 = ";
        double a = Double.parseDouble(s.substring(0, 3));
        double b = Double.valueOf(s.substring(5, 9));
        s += Double.toString(a + b);
        System.out.println(s);
        return s;
    }

   
}