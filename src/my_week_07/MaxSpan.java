package my_week_07;

public class MaxSpan {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3};
        int maxSpan = maxSpan(nums);
        System.out.println(maxSpan);
    }

    public static int maxSpan(int[] nums) {
        boolean isTrue = true;
        int spanMax = 0;
        if (nums.length < 1) {
            return 0;
        } else if (nums.length < 2) {
            return 1;
        } else if (nums.length < 3 && nums[0] != nums[1]) {
            return 1;
        } else {
            for (int i = 0; i < nums.length; i++) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[i] == nums[j]) {
                        if (isTrue) {
                            spanMax = j - i + 1;
                            isTrue = false;
                            break;
                        }
                        if (!isTrue && spanMax < (j - i + 1)) {
                            spanMax = j - i + 1;
                            break;
                        }
                    }
                }
            }
        }

        return spanMax;
    }

}
