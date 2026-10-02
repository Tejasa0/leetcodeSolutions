class Solution {
    public int reverseDegree(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('z', 1);
        hm.put('y', 2);
        hm.put('x', 3);
        hm.put('w', 4);
        hm.put('v', 5);
        hm.put('u', 6);
        hm.put('t', 7);
        hm.put('s', 8);
        hm.put('r', 9);
        hm.put('q', 10);
        hm.put('p', 11);
        hm.put('o', 12);
        hm.put('n', 13);
        hm.put('m', 14);
        hm.put('l', 15);
        hm.put('k', 16);
        hm.put('j', 17);
        hm.put('i', 18);
        hm.put('h', 19);
        hm.put('g', 20);
        hm.put('f', 21);
        hm.put('e', 22);
        hm.put('d', 23);
        hm.put('c', 24);
        hm.put('b', 25);
        hm.put('a', 26);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans += (i + 1) * hm.get(s.charAt(i));
        }
        return ans;
    }
}