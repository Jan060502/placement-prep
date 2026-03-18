import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";

        HashSet<Character> set = new HashSet<>();
        String result = "";

        for(char ch : str.toCharArray()) {
            if(!set.contains(ch)) {
                set.add(ch);
                result += ch;
            }
        }

        System.out.println(result);
    }
}