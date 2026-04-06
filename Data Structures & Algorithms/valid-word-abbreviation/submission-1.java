class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        int n = word.length(), m = abbr.length();

        while (i < n && j < m) {
            if (Character.isLetter(abbr.charAt(j))) {
                if (word.charAt(i) != abbr.charAt(j)) {
                    return false;
                }
                i++;
                j++;
            } else {
                // number parsing
                if (abbr.charAt(j) == '0') return false; // leading zero not allowed
                int num = 0;
                while (j < m && Character.isDigit(abbr.charAt(j))) {
                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i += num; // skip 'num' chars
            }
        }

        return i == n && j == m;
    }
}
