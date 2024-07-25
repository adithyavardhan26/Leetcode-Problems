class Solution {
    public int jump(int[] nums) {
        int jumps = 0, curEnd = 0, curFasthest = 0;
        for(int i =0; i<nums.length-1;i++){
            curFasthest = Math.max(curFasthest,i+nums[i]);
            if(i == curEnd){
                curEnd = curFasthest;
                jumps++;
            }
        }
        return jumps;
    }
}