class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}

        for ele in strs:
            s = list(ele)
            s.sort()
            ans = "".join(s)

            if(ans in map):
                map[ans].append(ele)
            else:
                map[ans] = [ele]
            
        lst = []
        
        for i in map.values():
            lst.append(i)

        return lst
            