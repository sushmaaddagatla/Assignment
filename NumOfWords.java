import java.io.*;
import java.util.HashMap;
import java.util.Map;
 
public class NumOfWords { 
    public static void main(String[] args)
    {
        // Declaring String
        String str = "NEHA IS TALLER THAN SIDDHI WHILE SIDDHI IS TALLER THAN ISHA";
        // Declaring HashMap of <String, Integer>
        Map<String, Integer> hashMap = new HashMap<>();
 
        // Splitting & Sorting
        String[] words = str.split(" ");
 
        for (String word : words) {
 
            Integer integer = hashMap.get(word);
 
            if (integer == null)
                hashMap.put(word, 1);
            else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}
