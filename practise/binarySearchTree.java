package practise;
class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data = data;
    }
}

public class binarySearchTree {
    Node root;
    public void insert(int data){
        root = insertRec(root,data);
    }

    public Node insertRec(Node root , int data){
        if(root == null){
            root = new Node(data);
        }else if(data < root.data){
            root.left =  insertRec(root.left, data);
        }else{
            root.right = insertRec(root.right, data);
        }
        return root;

    }

    public void Traverse(){
        inOrder(root);
    }

    public void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
    }
}
