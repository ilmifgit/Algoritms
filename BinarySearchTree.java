

public class BinarySearchTree {
    public int value;
    public BinarySearchTree leftChild;
    public BinarySearchTree rightChild;
//    BinarySearchTree tree = new BinarySearchTree();
    public BinarySearchTree(int value){
        this.value=value;
        this.leftChild = null;
        this.rightChild = null;
    }
    public BinarySearchTree getLeftChild(){
        return this.leftChild;
    }
    public BinarySearchTree getRightChild(){
        return this.rightChild;
    }
    public int getValue(){
        return this.value;
    }
    public void insert(int num){
        if(this.value>num){
            if(leftChild==null){
                leftChild = new BinarySearchTree(num);
            }else{
                leftChild.insert(num);
            }
        }else{
            if(rightChild==null){
                rightChild = new BinarySearchTree(num);
            }else{
                rightChild.insert(num);
            }
        }


//        this.value=num;
//         while (true){
//             if(){}
//        }
    }

    public boolean contains(int value){
        if(this.value!=value){
            if(this.value>value){
                if(leftChild==null){
                    return false;
                }else{
                    return leftChild.contains(value);
                }
            }else{
                if(rightChild == null){
                    return false;
                }else{
                    return rightChild.contains(value);
                }
            }

        }else{
            return true;
        }
    }

    public static void preOrden(BinarySearchTree tree){
        if(tree!=null){
            System.out.println(tree.value);
            preOrden(tree.leftChild);
            preOrden(tree.rightChild);
        }
    }
    public static void inOreden(BinarySearchTree tree){
        if(tree !=null){
            inOreden(tree.leftChild);
            System.out.println(tree.value);
            inOreden(tree.rightChild);


        }
    }
    public static void postOrden(BinarySearchTree tree){
        if(tree != null){
            postOrden(tree.leftChild);
            postOrden(tree.rightChild);
            System.out.println(tree.value);
        }
    }
    public void delete(int value){
        this.value=value;
    }
    public int pop(){
        BinarySearchTree parent = null;
        BinarySearchTree lefNode = leftChild;
        BinarySearchTree rigNode = rightChild;

        if(lefNode == null && rigNode == null){
            System.out.println("dyrak");
        } else if (lefNode.rightChild != null) {
            parent = lefNode.rightChild;
            lefNode.rightChild = null;
            value = parent.value;
        } else if (rigNode.leftChild != null) {
            parent = rigNode.leftChild;
            rigNode.leftChild = null;
            value = parent.value;
        } else if (lefNode.rightChild == null && lefNode.leftChild != null) {
            parent = lefNode;
            lefNode = lefNode.leftChild;
            lefNode.leftChild = null;
            value = parent.value;
        } else if (rigNode.leftChild == null && rigNode.rightChild != null){
            parent = rigNode;
            rigNode = rigNode.rightChild;
            rigNode.rightChild = null;
            value = parent.value;
        } else if (lefNode != null && lefNode.rightChild == null && lefNode.leftChild == null) {
            parent = lefNode;
            lefNode = null;
            value = parent.value;
        } else if (rigNode != null && rigNode.leftChild == null && rigNode.rightChild == null) {
            parent = rigNode;
            rigNode = null;
            value = parent.value;
        } else if (lefNode == null) {
            parent = rigNode;
            
        }
        return value;
    }




}
