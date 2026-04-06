class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return "empty";
        return String.join("rakesh", strs);
    }

    public List<String> decode(String str) {
        if(str.isEmpty()) return Arrays.asList("");
        if(str.equals("empty")) return new ArrayList<>();
        String[] strs = str.split("rakesh");
        return Arrays.asList(strs);
    }
}
