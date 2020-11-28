package ListPackage2;

import java.util.Scanner;

/**
 * 用 java 实现数据结构中的链表
 */
public class ListTest {

    /**
     * 头插法建立单链表
     */
    public static ListNode createLink(){
        System.out.println("请输入链表中的元素：");
        ListNode h = new ListNode();
        h.next = null;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x != -1){
            ListNode s = new ListNode();
            s.data = x;
            s.next = h.next;
            h.next = s;
            x = sc.nextInt();
        }
        return h;
    }


    /**
     * 尾插法建立单链表
     */
    public static ListNode createLink2(){
        System.out.println("请输入链表中的元素：");
        ListNode L = new ListNode();
        L.next = null;
        ListNode r = L;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x != -1){
            ListNode s = new ListNode();
            s.data = x;
            s.next = r.next;
            r.next = s;
            r = s;
            x = sc.nextInt();
        }
        return L;
    }


    /**
     * 按序号查找元素
     */
    public static int searchList2(ListNode L, int index){
        ListNode p = L;
        int count = 0;
        while (p.next != null && count < index){
            p = p.next;
            count++;
        }
        if (count == index){
            return p.data;
        }else {
            return -1;
        }
    }


    /**
     * 按值查找元素
     */
    public static int searchList(ListNode L, int value){
        ListNode p = L;
        int index = 0;
        while (p != null && p.data != value){
            p = p.next;
            index++;
        }
        if (index == lengthList(L)){
            return -1;
        }else {
            return index;
        }
    }

    /**
     * 插入结点
     */
    public static void addNode(ListNode L, int d){
        ListNode newNode = new ListNode(d);
        ListNode p = L;
        if (p == null){
            p = newNode;
            return;
        }
        while (p.next != null){
            p = p.next;
        }
        p.next = newNode;
    }



    /**
     * 删除第 index 个节点
     */
    public static boolean deleteNode(ListNode L, int index){
        if (index < 1 || index > lengthList(L)){
            return false;
        }
        if (index == 1){
            L = L.next;
            return true;
        }
        int i = 1;
        ListNode preNode = L;
        ListNode curNode = preNode.next;
        while (curNode != null){
            if (i == index){
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }


    /**
     * 求表长
     */
    public static int lengthList(ListNode L){
        int length = 0;
        ListNode p = L;
        while (p != null){
            length++;
            p = p.next;
        }
        return length;
    }

    /**
     * 输出
     */
    public static void printList(ListNode L){
        ListNode p = L;
        System.out.println("输出链表内容为：");
        while (p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println(" ");
    }

    /**
     * 单链表的倒置
     */
    public static ListNode Reverse(ListNode L){
        ListNode p;
        ListNode q;
        p = L.next;
        L.next = null;
        while (p != null){
            q = p;
            p = p.next;
            q.next = L.next;
            L.next = q;
        }
        return L;
    }

    public static void main(String[] args) {
        ListNode L;

        //头插法创建单链表
//        L = createLink();
        //尾插法建立单链表
        L = createLink2();
        //输出单链表
        printList(L);
        //计算单链表的长度
        int length = lengthList(L);
        System.out.println("链表中元素个数为：" + length);
        //添加节点
        addNode(L, 8);
        printList(L);
        //删除节点
        deleteNode(L,1);
        printList(L);
        //按值查找
        int value = searchList(L, 1);
        System.out.println("按值查找：" + value);
        //按位置查找
        int index = searchList2(L, 2);
        System.out.println("按位置查找：" + index);
        //单链表的倒置
        L = Reverse(L);
        System.out.println("单链表的倒置：");
        printList(L);
    }
}
