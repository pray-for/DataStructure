package SortPackage;

public class InsertSort {

    public static int[] InsertSortFun(int[] nums){

        for (int i = 0; i < nums.length; i++){
            for (int j = i; j > 0; j--){
                if (nums[j-1] > nums[j]){
                    int t = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = t;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {33,12,25,46,33,68,19,80};
        int[] sortNums = InsertSortFun(nums);
        for (int num : sortNums){
            System.out.println(num);
        }
    }

}
