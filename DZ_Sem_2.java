// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class DZ_Sem_2 {
    public static void main(String[] args) throws Exception {
        // 1 вариант 
        System.out.println("1 вариант");
        String text_DZ_2 = "{name: Ivanov, country: Russia, city:Moscow, age:null}";
        System.out.println(text_DZ_2);
        String[] strings = text_DZ_2
        .replace(" ", "")   // т.к. в тексте разное количество пробелов
        .replace("{", "")
        .replaceAll(":", " ")
        .replaceAll(",", " ")
        .replace("}", "")
        .split(" ");

        // вывод в консоль массива strings
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println();

        StringBuilder rezult = new StringBuilder();

        for (int i = 0; i < strings.length-1; i++) {
            if (strings[i+1].equals("null") == false) {
                if (i%2 == 0) {
                    rezult.append(strings[i]).append(" = ").append(strings[i+1]).append(", ");
                }    
            }
            }   

        System.out.println(rezult);
        System.out.println();

        // 2 вариант
        System.out.println("2 вариант");

        String [] text_DZ = lib.ReadLineFromFile("Java API/Java_APi_DZ/TextForDZ_2.txt"); 
        System.out.println(text_DZ[0]); 
        StringBuilder rezult_2 = Strings_2(text_DZ[0]);
        System.out.println(rezult_2);
       
    }
    public static StringBuilder Strings_2(String element) {
        String element1 = element.replace("{", "");
        String element2 = element1.replace("}", "");
        String element3 = element2.replaceAll("\"", "");
        System.out.println(element3);
        StringBuilder result = new StringBuilder("select * from students where => ");

        String [] arrayData = element3.split(", ");
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            if(arrData[1].equals("null") == false) {
                if (i != 0) {
                    result.append(", ");
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                } else {
                    result.append(arrData[0]);
                    result.append(" = ");
                    result.append(arrData[1]);
                }
            }
        }
        return result;
    }
}