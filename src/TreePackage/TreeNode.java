package TreePackage;

/**
 * 定义树的节点
 * 即定义二叉链表的节点
 */
public class TreeNode {
    Object value;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(Object value){
        this.value = value;
    }

    public TreeNode(Object value, TreeNode leftChild, TreeNode rightChild){
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
