package ListPackage;

import javax.xml.soap.Node;
import java.util.Scanner;

/**
 * 用 java 实现数据结构中的链表
 */
public class ListTest1 {

    //头结点
    Node head = null;

    /**
     * 定义节点结构
     */
    class Node{
        Node next = null;
        int data;

        //构造器
        public Node(){
        }

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    /**
     * 头插法建立单链表
     */
//    public Node createLink(){
//        Node h = new Node();
//        h.next = null;
////        Node s;
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        while (x != -1){
//            Node s = new Node();
//            s.data = x;
//            s.next = h.next;
//            h.next = s;
//            x = sc.nextInt();
//        }
//        return h;
//    }


    /**
     * 尾插法建立单链表
     */


    /**
     * 按序号查找元素
     */
    public int searchList2(int index){
        Node p = head;
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
    public int searchList(int value){
        Node p = head;
        int index = 0;
        while (p != null && p.data != value){
            p = p.next;
            index++;
        }
        if (index == lengthList()){
            return -1;
        }else {
            return index;
        }
    }

    /**
     * 插入结点
     */
    public void addNode(int d){
        Node newNode = new Node(d);
        if (head == null){
            head = newNode;
            return;
        }
        Node p = head;
        while (p.next != null){
            p = p.next;
        }
        p.next = newNode;
    }



    /**
     * 删除第 index 个节点
     */
    public boolean deleteNode(int index){
        if (index < 1 || index > lengthList()){
            return false;
        }
        if (index == 1){
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
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
    public int lengthList(){
        int length = 0;
        Node p = head;
        while (p != null){
            length++;
            p = p.next;
        }
        return length;
    }

    /**
     * 输出
     */
    public void printList(){
        Node p = head;
        System.out.println("输出链表内容为：");
        while (p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println(" ");
    }


    public static void main(String[] args) {

        ListTest1 list = new ListTest1();
        list.addNode(1);
        list.addNode(2);
        list.addNode(6);
        list.addNode(8);
        list.addNode(9);
        System.out.println("list.head.data---" + list.head.data);
        System.out.println("length---" + list.lengthList());
        list.printList();
//        list.deleteNode(1);
//        list.printList();
        int index = list.searchList(6);
        System.out.println("元素在链表中的位置为：" + index);
        int value = list.searchList2(3);
        System.out.println("元素的值为：" + value);

    }
}
