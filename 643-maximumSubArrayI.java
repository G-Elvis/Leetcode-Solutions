class Solution{
    public double findMaxAverage(int [] nums, int k){
        double windowSum = 0;
        for(int i=0;i < k;i++){
            windowSum += nums[i];
        }

        double maxAverage = windowSum/k;
        int left = 0;

        for(int right = k;right<nums.length;right++){
            windowSum -= nums[left];
            windowSum += nums[right];
            left++;

            double currentAverage = windowSum/k;
            maxAverage = Math.max(maxAverage, currentAverage);
        }
    return maxAverage;
    }

    public void main(String[] args) {
        int [] nums = {0,1,1,3,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }
}


//nums = [0,1,1,3,3], k = 4