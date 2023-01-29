package src.BinaryTree;

public class BinaryTree {

    public Node root;

    public BinaryTree(int[] array){
//        Krijojme nyjen e re rrenje
        root = new Node(array[0]);

        for (int i = 1; i < array.length; i++) {
            insert(array[i]);
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        Node current = root;

        while (true) {
            if (data % 2 == 0) {
                if (current.getLeft() == null) {
                    current.setLeft(newNode);
                    return;
                }
                current = current.getLeft();
            } else {
                if (current.getRight() == null) {
                    current.setRight(newNode);
                    return;
                }
                current = current.getRight();
            }
        }


    }


}
