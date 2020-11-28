package ListPackage2;

public class ListNode {
    //头结点
    ListNode head = null;
    /**
     * 定义节点结构
     */

    ListNode next = null;
    int data;

    //构造器
    public ListNode(){
    }

    public ListNode(int data){
        this.data = data;
    }

    public ListNode(int data, ListNode next){
        this.data = data;
        this.next = next;
    }

}
