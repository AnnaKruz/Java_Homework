import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class Homework5 {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<()[]<>>}")); // true
    }

    /**
 * Дана последовательность скобочек. Проверить, что она является корректной.
 */
    static boolean isCorrectParentheses(String parentheses) {
    // TODO: 07.04.2023 Вписать решение!
    // Нужно завести маппинг скобочек либо ( -> ), либо ) -> ( и так для каждой пары
    // Нужно использовать Deque.
    // Открывающуюся скобку вносим в Deque (insertFirst)
    // Если встретилась закрывающаяся скобка, то (Deque#pollFirst) и сравниваем ее с встретившейся
    Map<Character, Character> map = new HashMap<>();
    map.put(')','(');
    map.put(']','[');
    map.put('>','<');
    map.put('}', '{');
    Deque<Character> list = new LinkedList<>();
    for (char character : parentheses.toCharArray()) {
        if (map.containsValue(character)) {
            list.push(character);
        } else if (map.containsKey(character)) {
            if (list.isEmpty() || list.pop() != map.get(character)) {
                return false;
            }
        }
    }
    return list.isEmpty();
    }
}
