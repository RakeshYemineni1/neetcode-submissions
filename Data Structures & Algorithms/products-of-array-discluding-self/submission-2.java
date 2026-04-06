class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int total_product = 1;
        int[] zero = new int[1];
       for(int nu : nums){
        if(nu == 0){
            zero[0]++;
            continue;
        }
        total_product *= nu;

       } 
       int[] res = new int[n];

       for(int i = 0; i < n; i++){
        if(zero[0] > 1){
            res[i] = 0;
            continue;
        }
        if(zero[0] == 1){
            if(nums[i] == 0){
                res[i] = total_product;
            }else{
                res[i] = 0;
            }
        }else res[i] = total_product/nums[i];
       }

       return res;
    }
}  
