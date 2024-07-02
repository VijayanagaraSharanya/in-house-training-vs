//longest substring without repeating characters

import java.util.*;

import java.util.HashSet;

public class Question60 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        int i = 0, j = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        while (i < n && j < n) {
            // Try to extend the range [i, j]
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                longest = Math.max(longest, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(str));
        sc.close();
    }
}
