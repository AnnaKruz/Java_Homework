import java.util.LinkedList;
import java.util.Scanner;


public class Homework4 {
    public static void main(String[] args) {
// Реализовать приложение, которое:
// Принимает от пользователя и запоминает строки
// Если пользователь ввел print, то выводим все предыдущие строки в обратном порядке
// Если введено revert, то удаляем последнюю введеную строку
// Если введено exit, то завершаем программу

// java
// c++
// python
// c#
// print
// < [c#, python, c++, java]
// revert
// print
// < [python, c++, java]
// exit

        Scanner sc = new Scanner(System.in);
        LinkedList<String> storage = new LinkedList<>();
        String input;
        while (!(input = sc.nextLine()).equals("exit")) {
            if ("print".equals(input)) {
                System.out.println(storage);
            } else if ("revert".equals(input)) {
                storage.removeFirst(); 
            } else {
                storage.addFirst(input);
            }
        }
    }
}
