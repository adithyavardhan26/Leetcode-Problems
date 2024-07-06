class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int [] a = new int[n+1];
        Arrays.fill(a,-1);
        for(int  i = 0;i<nums.length;i++){
            a[nums[i]] = nums[i];
        }
        for(int i =0;i<a.length;i++){
            if(a[i] == -1){
                return i;
            }
        }
        return 0;
    }
}