package SortPackage;

public class BubbleSort {

    public static int[] BubbleSortFun(int[] nums){

        for (int i = 0; i < nums.length-1; i++){
            for (int j = 0; j < nums.length-1; j++){
                if (nums[j] > nums[j+1]){
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {33,68,46,33,25,80,19,12};
        int[] sortNums = BubbleSortFun(nums);
        for (int num : sortNums){
            System.out.println(num);
        }
    }

}
