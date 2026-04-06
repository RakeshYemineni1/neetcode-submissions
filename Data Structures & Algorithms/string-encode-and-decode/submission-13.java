class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        //if(strs.isEmpty()) return "";
        for(String s : strs){
            if(s.equals("")) sb.append("rakes");
            sb.append(s).append("rakesh");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.equals("rakesh")) return new ArrayList<>(Arrays.asList(""));
        String[] s = str.split(java.util.regex.Pattern.quote("rakesh"));
        List<String> li = new ArrayList<>();
        for(String st : s){
            if(st.equals("")) continue;
            if(st.equals("rakes")) li.add("");
            else li.add(st);
        }
        return li;
    }
}
