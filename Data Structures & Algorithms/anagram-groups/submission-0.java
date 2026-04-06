class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashSet<String> set = new HashSet<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String k = new String(ch);
            if(!map.containsKey(k)) map.put(k, new ArrayList<>());
            map.get(k).add(word);           
        }

        return new ArrayList<>(map.values());
    }
}
