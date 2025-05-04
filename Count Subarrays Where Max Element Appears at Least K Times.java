class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int num: nums) max=Math.max(max,num);
        int left=0;
        long ans=0;
        int maxOccurence=0;
        for(int right=0; right<nums.length; right++){
            if(nums[right]==max)maxOccurence++;
            while(maxOccurence==k){
                if(nums[left]==max)maxOccurence--;
                left++;
            }
            ans+=left;
        }
        return ans;
    }
}