class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {}

        for i in nums:
            map[i] = map.get(i, 0) + 1
        
        sorted_map = sorted(map.items(), key = lambda x : x[1], reverse = True)

        lt = []

        for i, j in sorted_map[0:k]:

            lt.append(i)
        
        return lt
        
