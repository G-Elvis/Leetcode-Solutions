import java.util.Arrays;

class Solution{
    public void moveZeros(int [] nums){
        int k = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != 0){
                nums[k] =nums [i];
                k++;
            }
        }
        while (k < nums.length){
            nums[k] = 0;
            k++;
        }
        System.out.println(nums);
    }
    // Test Case
    public void main(String[] args) {
        int nums [] = {0,1,0,3,12};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}