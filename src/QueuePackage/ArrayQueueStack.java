package QueuePackage;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * 用 ArrayDeque 实现 栈
 */
public class ArrayQueueStack {
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        Scanner sc = new Scanner(System.in);
        int num;
        while ((num = sc.nextInt()) != -1){
            stack.push(num);
        }
//        String s;
//        while ((s = sc.next()) != "zz"){
//            stack.push(s);
//        }
        //获取栈顶元素，并移除栈顶
        System.out.println(stack.pop());
        System.out.println("栈中元素个数为：" + stack.size());
        System.out.println(stack.pop());
        System.out.println("栈中元素个数为：" + stack.size());
    }
}
