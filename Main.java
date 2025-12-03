public class Main {
    public static void main(String[] args) {
        BinarySearchTree n = new BinarySearchTree(5);
        n.insert(8);
        n.insert(7);
        n.insert(3);
        n.insert(2);

        System.out.println(n.contains(8));
        System.out.println(n.contains(7));
        System.out.println(n.contains(3));
        System.out.println(n.contains(2));

        BinarySearchTree.preOrden(n);
        BinarySearchTree.inOreden(n);
        BinarySearchTree.postOrden(n);
    }
}