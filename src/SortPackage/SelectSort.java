package SortPackage;

public class SelectSort {

    public static int[] SelectSortFun(int[] nums){

        for (int i = 0; i < nums.length; i++){
            int minindex = i;
            for (int j = i; j < nums.length; j++){
                if (nums[minindex] > nums[j]){
                    minindex = j;
                }
            }
            if (minindex != i){
                int t = nums[i];
                nums[i] = nums[minindex];
                nums[minindex] = t;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {98,68,46,33,25,80,19,12};
        int[] sortNums = SelectSortFun(nums);
        for (int num : sortNums){
            System.out.println(num);
        }
    }
}
