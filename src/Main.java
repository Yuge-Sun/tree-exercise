public class Main {
    public static void main(String[] args) {
        Node root = new Node(0);
        root.left = new Node(1);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(5);

        System.out.println(root.left.data);
        System.out.println(root.getNumberOfNodes(root));
        System.out.println(root.countLeafNodes(root));
        System.out.println(root.getTotal(root.left));
    }
}