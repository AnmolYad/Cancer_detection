class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pb=1;
        int pa=1;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=pb;
            pb*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i]*=pa;
            pa*=nums[i];
        }
        return res;
        }
}
