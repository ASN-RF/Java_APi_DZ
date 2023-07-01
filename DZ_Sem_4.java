import java.util.Scanner;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.LinkedList;

public class DZ_Sem_4
{
    public static void main(String[] args){
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();
        String count = "";
        System.out.print("Вы хотите ввести данные (Yes/No)? ");
        Scanner iScanner = new Scanner(System.in);
        count = iScanner.next();
        while (count.equals("Yes")) {
            System.out.print("Сколько человек Вы хотите добавить в базу? ");
            Integer Number = iScanner.nextInt();
            for (int i = 0; i <= Number-1; i++){
                int num = i + 1;
                System.out.println("Введите фамилию " + num + "-го" + " человека:");
                family.add(iScanner.next());
                String family_temp = family.get(i);
                System.out.println("Введите Имя " + num + "-го" + " человека:");
                name.add(iScanner.next());
                String name_temp = name.get(i);
                System.out.println("Введите Отчество " + num + "-го" + " человека (если его нет, то введите 'НЕТ'):");
                soname.add(iScanner.next());
                String soname_temp = soname.get(i);
                System.out.println("Возраст " + name_temp + " " + family_temp + ":");
                age.add(iScanner.nextInt());
                System.out.println("Укажите пол " + name_temp + " " + family_temp + "(M/Ж):");
                String gender_temp = iScanner.next();
                System.out.printf(gender_temp.toUpperCase());
                gender.add(gender_temp.toUpperCase().equals("M") ? true : false);
                index.add(i);
            }
            System.out.println("Вы хотите ввести ЕЩЁ данные (Yes/No)");
            count = iScanner.next();
            for (int i = 0; i < index.size(); i++){
                System.out.printf(family.get(i) + " ");
                System.out.printf(name.get(i).charAt(0) + "." + " ");
                System.out.printf(soname.get(i).charAt(0) + "." + " ");
                System.out.printf(age.get(i).toString() + " ");
                System.out.printf((gender.get(i) ? "M" : "Ж"));
                System.out.println();
            }
    
        }
   


    }






}
    
