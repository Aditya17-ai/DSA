class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char i: s.toCharArray()) map.put(i, map.getOrDefault(i, 0) + 1);
        int res = 0, odd = 0;
        for(int i: map.values()) {
            if(i % 2 == 0) res += i;
            else {
                res += i - 1;
                odd = 1;
            }
        }

        if(odd == 1) return res + 1;
        return res; 
    }
}