class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        if(len(s) != len(t)): return False

        c = [0] * 26

        for c_s, c_t in zip(s, t):
            c[ord(c_s) - ord('a')] += 1
            c[ord(c_t) - ord('a')] -= 1

        for i in c:
            if(i != 0): return False
    
        return True