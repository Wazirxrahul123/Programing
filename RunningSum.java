public class RunningSum {
    public static int[] runningSum(int[] nums) {
        // for(int i=1;i<nums.length;i++){
        //     nums[i]= nums[i]+nums[i-1];

        // }
        // return nums;
        int i=1;
        while(i<nums.length){
            nums[i]=nums[i]+nums[i-1];
            i++;
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {1,1,1,1,1,1};
        runningSum(nums);
    }
}
