public class test2 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int num;
        for (int i = 0; i < 6; i++) {
            for (int j = i+1; j < 6; j++) {
                for (int k = j+1; k < 6; k++) {
                    num = nums[i] + nums[j] + nums[k];
                    if (num == 0) {
                        System.out.println(nums[i] + "," + nums[j] + "," + nums[k]);
                    }
                }
            }
        }
    }
}