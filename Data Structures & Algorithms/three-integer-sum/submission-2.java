class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> tSum = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i = 0; i < n; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }

        // for(int i = 0; i < n; i++){
        //     map.put(nums[i], map.get(nums[i]) - 1);

        //     if(i > 0 && nums[i] == nums[i - 1]) continue;

        //     for(int j = i + 1; j < n; j++){
        //         map.put(nums[j], map.get(nums[j]) - 1);

        //         if(j > i + 1 && nums[j] == nums[j - 1]) continue;

        //         int k = 0 - (nums[i] + nums[j]);

        //         if(map.getOrDefault(k, 0) > 0){
        //             tSum.add(Arrays.asList(nums[i], nums[j], k));
        //         }
        //     }
        //     for(int j = i + 1; j < n; j++) map.put(nums[j], map.get(nums[j]) + 1);
        // }

        for(int i = 0; i < n; i++){
            int l = i + 1;
            int r = n - 1;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    tSum.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while(l < r && nums[l] == nums[l + 1]) l++;
                    while(l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                }else if(sum < 0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return tSum;
    }
}
