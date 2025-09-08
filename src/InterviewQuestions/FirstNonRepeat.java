package InterviewQuestions;

import java.util.*;

public class FirstNonRepeat {
    public static void main(String[] args) {
        String str = "aabbcde";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating: " + entry.getKey());
                break;
            }
        }
    }
}

