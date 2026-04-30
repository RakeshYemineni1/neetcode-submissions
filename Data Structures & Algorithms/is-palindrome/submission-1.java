class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(ch);
            }else if(Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        String k = sb.toString().toLowerCase();
        return isValid(k);
    }
    public static boolean isValid(String s){
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
