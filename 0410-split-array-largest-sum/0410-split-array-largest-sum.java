class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end  = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end = end + nums[i];
        }
        //binary search
        while (start<end) {
            int mid = start+(end-start)/2;
            //calculate how many pices you can divide this in with this max sum
            int sum=0;
            int pieces = 1;
            for(int num :nums){
                if (sum+num>mid) {
                    //you cannnot add this in this subarray, make new one
                    //say you add this num subarray, then sum = num
                    sum = num;
                    pieces++;
                }
                else{
                    sum = sum+num;
                }
            }
            if (pieces > k) {
                start = mid+1;
            }
            else{
                end = mid;
            }
        
        }
        return end;// here start = end
    }
}