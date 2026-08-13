import java.util.HashSet;

class Main {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return true;
            }            
            seen.add(nums[i]);
        
            if (seen.size() > k) {
                seen.remove(nums[i - k]);
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Main mainObj = new Main();
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(mainObj.containsNearbyDuplicate(nums, k));
    }
}