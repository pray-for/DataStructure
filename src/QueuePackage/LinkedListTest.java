package QueuePackage;

import java.util.LinkedList;

/**
 * 用 LinkedList 实现栈和队列
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.offer("aaa");        //队尾
        ll.push("bbb");         //栈顶
        ll.offerFirst("ccc");   //队头（相当于栈顶）
        for (int i = 0; i < ll.size(); i++){
            System.out.println("遍历中：" + ll.get(i));
        }
        //访问并不删除栈顶
        System.out.println(ll.peekFirst());
        //访问并不删除队列最后一个
        System.out.println(ll.peekLast());
        //访问并移除栈顶
        System.out.println(ll.pop());
    }
}
