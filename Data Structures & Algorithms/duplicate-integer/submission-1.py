class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        n = set()
        for i in range (0, len(nums)):
            if(nums[i] in n): return True
            n.add(nums[i])
        return False