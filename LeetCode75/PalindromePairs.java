package LeetCode75;
import java.util.*;
public class PalindromePairs {
    // Time Limit Exceeded...
    public static List<List<Integer>> Solution (String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        Map<String, String> logger = new HashMap<>();

        int index = 0;

        while (index < words.length) {
            String tempWord = words[index];
            for (int i = 0; i < words.length; i++) {
                if (index == i)
                    continue;
                else if ((isPalindrome(tempWord, words[i]))) {
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(index);
                    tempList.add(i);
                    result.add(tempList);

                }
            }
            ++index;
        }

        return result;
    }

    public static boolean isPalindrome (String s1, String s2) {
        System.out.println(Arrays.toString(s1.split(s2)));
        String reverse = new StringBuilder(s2).reverse().toString();

        if (s1.equals(reverse))
            return true;

        String temp = s1 + s2;

        if (temp.length() == 1)
            return true;
        if (temp.length() == 3) {
            return temp.charAt(0) == temp.charAt(2);
        }

        for (int i = 0; i < temp.length() / 2; i++) {
            if (temp.charAt(i) != temp.charAt(temp.length() - 1 - i)) {
                return false;
            }
        }

//        int right = temp.length() / 2;
//        int left = right - 1;
//
//        while (left >= 0) {
//            if (temp.charAt(left) != temp.charAt(right)) {
//                return false;
//            }
//            ++right;
//            --left;
//        }

        return true;
    }

    public static void main(String[] args) {
        String[] container = {"abcd","dcba","lls","s","sssll"};
        List<String[]> testCases = new ArrayList<>();
        String testPalin = "abcddcba";

        testCases.add(container);
        testCases.add(new String[] {"bat","tab","cat"});
        testCases.add(new String[]{"a", ""});
        testCases.add(new String[] {"a","abc","aba",""});
        testCases.add(new String[]{"a","aa","aaa"});
        System.out.println(Arrays.toString(testPalin.split("abcd")));
//        System.out.println(isPalindrome("bbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaabbbbaaaa", "aaaabbb"));
//        System.out.println(Arrays.toString(Solution(container).toArray()));
//        System.out.println(Arrays.toString(Solution(testCases.get(2)).toArray()));
    }
}
