class Solution {
    public int pivotIndex(int[] nums) {
        int right=0,left=0;
        for(int a:nums){
            right+=a;
        }
        for(int i=0; i<nums.length;i++){
            right=right-nums[i];
            if(right==left){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}