package StackPackage;

import java.util.Scanner;
import java.util.Stack;

/**
 * 用 Stack 类实现栈
 */
public class StackTest {
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        int num;
        while ((num = sc.nextInt()) != -1){
            s.push(num);
        }
        System.out.println("元素2在栈中的位置：" + s.search(2));
        System.out.println("弹出栈顶元素：" + s.pop());
        System.out.println("栈中元素个数为：" + s.size());
        System.out.println("弹出栈顶元素：" + s.pop());
        System.out.println("栈中元素个数为：" + s.size());
    }
}
