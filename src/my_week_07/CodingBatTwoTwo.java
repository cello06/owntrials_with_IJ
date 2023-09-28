package my_week_07;

public class CodingBatTwoTwo {
    public static void main(String[] args) {
        int [] nums = {4,2,2,3};
        boolean isTwoTwo = twoTwo(nums);
        System.out.println(isTwoTwo);
    }
    public static boolean twoTwo(int[] nums) {
        if(nums.length < 1){
            return true;
        }else if(nums.length < 2){
            return nums[0] != 2;
        }else if(nums.length < 3){
            return (nums[0] == 2 && nums[1] == 2) ;
        }else{
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] == 2){
                    if(i < 1){
                        if(nums[i+1] != 2){
                            return false;
                        }
                    }else if(i < nums.length -1){
                        if(nums[i-1] != 2 && nums[i+1] != 2){
                            return false;
                        }
                    }else{
                        if(nums[i-1] != 2){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}
