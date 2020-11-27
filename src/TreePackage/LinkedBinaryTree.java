package TreePackage;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树基本算法
 */
public class LinkedBinaryTree {

    //判断二叉树是否为空
    public static boolean isEmpty(Node root) {
        if (root == null){
            return true;
        }else {
            return false;
        }
    }

    //输出二叉树节点数量
    //递归思想，节点数 = 左子树 + 右子树 + 1；
    public static int size(Node root) {
        if (root == null){
            return 0;
        }else{
            int sizel = size(root.leftChild);
            int sizer = size(root.rightChild);
            return sizel+sizer+1;
        }
    }

    //二叉树高度
    //递归思想，高度 = 左右子树最大高度 + 1；
    public static int getHeight(Node root) {
        if (root == null){
            return 0;
        }else {
            int heightl = getHeight(root.leftChild);
            int heightr = getHeight(root.rightChild);
            if (heightl > heightr){
                return heightl + 1;
            }else {
                return heightr + 1;
            }
        }
    }

    //在二叉树中查找某个值
    //递归思想，将value逐个和 根节点、以及根节点的左右子树值进行比较
    public static Node findKey(Node root, Object value) {
        if (root == null){
            return null;
        }else if (root != null && root.value == value){
            return root;
        }else {
            Node leftnode = findKey(root.leftChild, value);
            Node rightnode = findKey(root.rightChild, value);
            if (leftnode != null && leftnode.value == value){
                return leftnode;
            }else if (rightnode != null && rightnode.value == value){
                return rightnode;
            }else {
                return null;
            }
        }
    }

    //先序遍历递归
    public static void preOrderTraverse(Node root) {
        if (root != null){
            System.out.print(root.value + " ");
            preOrderTraverse(root.leftChild);
            preOrderTraverse(root.rightChild);
        }

    }

    //中序遍历递归
    public static void inOrderTraverse(Node root) {
        if (root != null){
            inOrderTraverse(root.leftChild);
            System.out.print(root.value + " ");
            inOrderTraverse(root.rightChild);
        }
    }

    //后序遍历递归
    public static void postOrderTraverse(Node root) {
        if (root != null){
            postOrderTraverse(root.leftChild);
            postOrderTraverse(root.rightChild);
            System.out.print(root.value + " ");
        }
    }

    //层次遍历（借助队列）
    //按照从上到下，从左到右遍历；又叫广度优先遍历；
    //可以用 queue队列接口 来完成；LinkedList 实现了该接口；
    public static void levelOrderByStack(Node root) {
        if (root == null){
            return;
        }else {
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);
            while (queue.size() != 0){
                for (int i = 0; i < queue.size(); i++){
                    Node temp = queue.poll();
                    System.out.print(temp.value + " ");
                    if (temp.leftChild != null){
                        queue.add(temp.leftChild);
                    }
                    if (temp.rightChild != null){
                        queue.add(temp.rightChild);
                    }
                }
            }
        }
    }

    //先序遍历 非递归（借助栈）
    public static void preOrderByStack(Node root){
        Deque<Node> stack = new LinkedList<Node>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                System.out.print(root.value + " ");
                stack.push(root);
                root = root.leftChild;
            }
            if (!stack.isEmpty()){
                root = stack.pop();
                root = root.rightChild;
            }
        }
    }

    //中序遍历 非递归（借助栈）
    //（1）若根不为空，根入栈，并判断左子树是否为空；
    //（2）若不为空，子树根节点入栈，继续向下，直至左子树为空；
    //（3）若栈中有节点，将其取出，并对其右子树根节点进行1,2两步骤，直至无节点或栈空；
    public static void inOrderByStack(Node root) {
        Deque<Node> stack = new LinkedList<Node>();
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.leftChild;
            }
            if (!stack.isEmpty()){
                root = stack.pop();
                System.out.print(root.value + " ");
                root = root.rightChild;
            }
        }
    }

    //后序遍历 非递归（借助栈）
    public static void postOrderByStack(Node root){
        Deque<Node> stack = new LinkedList<Node>();
        Node temp = null;
        while (root != null || !stack.isEmpty()){
            while (root != null){
                stack.push(root);
                root = root.leftChild;
            }
            if (!stack.isEmpty()){
                root = stack.peek();
                if ((root.rightChild == null) || (root.rightChild == temp)){
                    root = stack.pop();
                    System.out.print(root.value + " ");
                    temp = root;
                    root = null;
                }else {
                    root = root.rightChild;
                }
            }
        }
    }

    public static void main(String[] args) {
        //创建二叉树
        Node node_F = new Node("F", null, null);
        Node node_E = new Node("E", null, null);
        Node node_D = new Node("D", null, null);
        Node node_C = new Node("C", node_F, null);
        Node node_B = new Node("B", node_D, node_E);
        Node node_A = new Node("A", node_B, node_C);

        //确定二叉树的根节点
        Node root = node_A;

        //调用函数
        int size = size(root);
        System.out.println("节点个数：" + size);
        int height = getHeight(root);
        System.out.println("树的高度：" + height);
        Node n = findKey(root, "B");
        System.out.println("节点信息：" + n);

        System.out.println("\n先序遍历：");
        preOrderTraverse(root);
        System.out.println("\n中序遍历：");
        inOrderTraverse(root);
        System.out.println("\n后序遍历：");
        postOrderTraverse(root);
        System.out.println("\n层次遍历：");
        levelOrderByStack(root);
        System.out.println("\n先序遍历（非递归）");
        preOrderByStack(root);
        System.out.println("\n中序遍历（非递归）：");
        inOrderByStack(root);
        System.out.println("\n后续遍历（非递归）：");
        postOrderByStack(root);


    }
}
