class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mer[]=new int[nums1.length+nums2.length];
        double med=0;
        for(int i=0;i<nums1.length;i++){
            mer[i]+=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            mer[i+nums1.length]+=nums2[i];
        }
        Arrays.sort(mer);
        if(mer.length%2!=0){
            med+=mer[(mer.length/2)];
        }
        else if(mer.length%2==0){
            double a=mer[(mer.length/2)-1];
            double b=mer[mer.length/2];
            med+=(a+b)/2;
        }
        return med;
    }
}