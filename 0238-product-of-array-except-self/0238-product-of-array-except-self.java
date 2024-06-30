class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zerocount = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                zerocount++;
            }
            else{
                product *=nums[i];
            }
        }
        int arr[] = new int[nums.length];
        for(int i = 0;i<arr.length;i++){
            if(zerocount == 0){
                arr[i] = product/nums[i];
            }
            else if(zerocount == 1){
                arr[i] = (nums[i] == 0) ? product:0;
            }
            else{
                arr[i] = 0;
            }
        }
        return arr;
    }
}