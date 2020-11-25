package QueuePackage;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * 用 ArrayDeque 实现 队列
 */
public class ArrayDequeQueue {
    public static void main(String[] args) {
        ArrayDeque queue = new ArrayDeque();
        Scanner sc = new Scanner(System.in);
        int num;
        while ((num = sc.nextInt()) != -1){
            queue.offer(num);
        }
        //获取队头，但不移除
        System.out.println(queue.peek());
        System.out.println("队列中元素个数为：" + queue.size());
        //获取队头，并移除
        System.out.println(queue.poll());
        System.out.println("队列中元素个数为：" + queue.size());
        System.out.println(queue.poll());
        System.out.println("队列中元素个数为：" + queue.size());

    }
}
