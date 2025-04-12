import java.util.*;

class Solution {
    public long countGoodIntegers(int n, int k) {
        Set<String> seen = new HashSet<>();
        List<String> palindromes = generatePalindromes(n);

        long result = 0;
        for (String p : palindromes) {
            if (p.charAt(0) == '0') continue;
            long num = Long.parseLong(p);
            if (num % k != 0) continue;

            char[] arr = p.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if (!seen.contains(sorted)) {
                seen.add(sorted);
                result += countPermutations(sorted);
            }
        }

        return result;
    }

    private List<String> generatePalindromes(int n) {
        List<String> res = new ArrayList<>();
        int halfLen = (n + 1) / 2;
        int start = (int) Math.pow(10, halfLen - 1);
        int end = (int) Math.pow(10, halfLen);

        for (int i = start; i < end; i++) {
            String half = Integer.toString(i);
            String pal = (n % 2 == 0)
                ? half + new StringBuilder(half).reverse().toString()
                : half + new StringBuilder(half.substring(0, half.length() - 1)).reverse().toString();
            res.add(pal);
        }

        return res;
    }

    private long countPermutations(String digits) {
        int[] freq = new int[10];
        for (char c : digits.toCharArray())
            freq[c - '0']++;

        long total = factorial(digits.length());
        for (int f : freq)
            total /= factorial(f);

        if (freq[0] > 0) {
            freq[0]--;
            long invalid = factorial(digits.length() - 1);
            for (int f : freq)
                invalid /= factorial(f);
            freq[0]++;
            total -= invalid;
        }

        return total;
    }

    private long factorial(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++)
            res *= i;
        return res;
    }
}
