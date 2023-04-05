import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Homework3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-40.8");
        strings.add("-5");
        strings.add("my_string");
        strings.add("-41");
        removeEvenNumber(strings);
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
    }


    static void removeEvenNumber(List<String> strings) {        
        // TODO: 31.03.2023 Удалить все четные элементы из списка        
       Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            try {
                int x = Integer.parseInt(iterator.next());
                if (x % 2 == 0) {
                    iterator.remove();                    
                }                
            } catch (NumberFormatException e) {
            }
        }
    }
    
    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            try {
                int x = Integer.parseInt(iterator.next());
                if (x % x == 0) {
                    iterator.remove();                    
                }                
            } catch (NumberFormatException e) {
            }
        }
    }


}
