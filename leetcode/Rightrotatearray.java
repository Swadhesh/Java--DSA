class Solution {
    public void reverse(int[] num,int start, int end){
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        for(int i=0;i<nums.length-1;i++){
            System.out.println(nums[i]);
        }
    }
}

