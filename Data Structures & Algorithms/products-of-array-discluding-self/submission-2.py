class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        num = 1
        pre = [0] * len(nums)
        suff = [0] * len(nums)
        for i in range(0, len(nums)):
            num *= nums[i]
            pre[i] = num
        
        num = 1
        for i in range(len(nums) -1, -1, -1):
            num *= nums[i]
            suff[i] = num
        
        res = [0] * len(nums)

        for i in range(0, len(nums)):
            if(i == 0): 
                res[i] = suff[i + 1]
            elif(i == len(nums) - 1):
                res[i] = pre[i - 1]
            else:
                res[i] = pre[i - 1] * suff[i + 1]
        
        return res
        