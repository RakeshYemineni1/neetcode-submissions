class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        Arrays.sort(nums);
        
        int num = nums[0];
        int i = 0; 
        int len = 0;
        int max = 1;

        while(i < n){
            if(num != nums[i]){
                num = nums[i];
                len = 0;
            }

            while(i < n && num == nums[i]){
                i++;
            }
            len++;
            num++;
            max = Math.max(len, max);
        }

        return max;
    }
}
