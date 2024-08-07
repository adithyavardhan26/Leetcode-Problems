class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        int l = Integer.MIN_VALUE;
        if(nums.length == 0) return 0;
        int count = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] -1 == l){
                l = nums[i];
                count++;
            }
            else if(nums[i] != l){
                l = nums[i];
                count =1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}