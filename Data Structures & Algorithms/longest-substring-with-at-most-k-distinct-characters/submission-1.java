class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();

        int l = 0, r = 0;
        int max = 0;

        while(r < n){
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(map.size() > k){
                ch = s.charAt(l);
                map.put(ch, map.getOrDefault(ch, 0) - 1);
                if(map.get(ch) == 0) map.remove(ch);
                l++;
            }

            if(map.size() <= k){
                max = Math.max(max, r - l + 1);
            }

            r++;
        }
        return max;
    }
}
