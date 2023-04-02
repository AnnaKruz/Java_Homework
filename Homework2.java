import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Homework2 {
    public static void main(String[] args) {
        String str = buildString(7, 'x', 'y');
        System.out.println(str);


        //  Создать файл file.txt
        //  Если файл уже создан, ничего делать не надо
        //  Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
        Path path = Path.of("file.txt");
        try {
            Files.createFile(path);
        } catch (IOException e) {
            System.out.println("При создании файла произошла ошибка: " + e.getMessage());
        }

        // OutputStream outputStream = Files.newOutputStream(path);
        // outputStream.writer.append(printString("TEXT", 100));
        String text = printString("TEXT", 100);

        try {
            Files.write(Paths.get("file.txt"), text.getBytes(), StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }



    
// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
// Пример. (n = 6, c1='a', c2='b') -> "ababab"
// (n = 8, c1='x', c2='y') -> "xyxyxyxy"

    static String buildString(int n, char c, char d) {
        // TODO: 28.03.2023 Домашнее задание!

        String result = "";
        result += c;

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                result += d;
           } else {
                result += c;
            }
        }
       return result;
    }
    
    static String printString(String source, int repeat) {
        // напечатать строку source repeat раз
        String result = "";
        for (int i = 0; i < repeat; i++) {
            result += source;
        }
        return result;
    }


}
