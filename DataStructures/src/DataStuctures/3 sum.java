class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> res=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum==-nums[i]){
                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }
                 else if(sum<-nums[i]){
                    j++;
                }
                else if(sum>-nums[i]){
                    k--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
