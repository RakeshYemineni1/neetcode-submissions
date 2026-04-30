class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        // int[] pre = new int[n];
        // int[] suff = new int[n];
        // pre[0] = heights[0];
        // suff[n - 1] = heights[n - 1];
        // for(int i = 1; i < n; i++){
        //     pre[i] = Math.max(heights[i], pre[i - 1]);
        // }
        // for(int i = n - 2; i >= 0; i--){
        //     suff[i] = Math.max(heights[i], suff[i + 1]);
        // }

        int area = 0;

        // for(int i = 0; i < n; i++){
        //     int side = Math.min(pre[i], suff[i]);
        //     area = Math.max(side * i, area);
        // }
        
        int i = 0;
        int j = n - 1;

        while(i < j){
            area = Math.max(Math.min(heights[i], heights[j]) * (j - i), area);

            if(heights[i] <= heights[j]) i++;
            else j--;
        }

        return area;
    }
}
