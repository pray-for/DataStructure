package SortPackage;

public class HalfInsertSort {

    public static int[] HalfInsertSortFun(int[] nums){

        int low;
        int high;
        int middle;
        for (int i = 1; i < nums.length; i++){
            low = 0;
            high = i-1;
            int t = nums[i];
            //最小值在low
            while (low <= high){
                middle = (low + high)/2;
                if (t < nums[middle]){
                    high = middle-1;
                }else {
                    low = middle+1;
                }
            }
            //有序表中插入位置后的元素依次后移
            for (int j = i; j > low; j--){
                nums[j] = nums[j-1];
            }
            //将t插到空出的位置
            nums[low] = t;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {33,12,25,46,33,68,19,80};
        int[] sortNums = HalfInsertSortFun(nums);
        for (int num : sortNums){
            System.out.println(num);
        }
    }

}
