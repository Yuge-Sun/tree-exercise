public class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }

    int getNumberOfNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + getNumberOfNodes(node.left) + getNumberOfNodes(node.right);
    }

    int isLeafNode(Node node) {
        if (node.left == null && node.right == null) {
            return 1;
        } else
            return 0;
    }

    int countLeafNodes(Node node) {
        if (isLeafNode(node) == 1) {
            return 1;
        } else if (node.left != null && node.right == null) {
            return countLeafNodes(node.left);
        } else if (node.left == null && node.right != null) {
            return countLeafNodes(node.right);
        } else {
            return countLeafNodes(node.left) + countLeafNodes(node.right);
        }
    }

    int getTotal(Node node) {
        if (node == null) {
            return 0;
        }
        return node.data + getTotal(node.left) + getTotal(node.right);
    }

}
