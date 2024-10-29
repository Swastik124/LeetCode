import java.util.Scanner;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedWord = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            mergedWord.append(word1.charAt(i));
            mergedWord.append(word2.charAt(j));
            i++;
            j++;
        }
        while (i < word1.length()) {
            mergedWord.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            mergedWord.append(word2.charAt(j++));
        }

        return mergedWord.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1 = sc.nextLine;
        String word2 = sc.nextLine;
        String mergedWord = mergeAlternately(word1, word2);
        System.out.println(mergedWord);
    }
}
