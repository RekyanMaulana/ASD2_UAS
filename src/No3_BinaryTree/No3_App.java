package No3_BinaryTree;
public class No3_App {
    public static void main(String[] args) {  
        No3 tree = new No3();
    
        No3_Node node;
    
        node = new No3_Node(50);
        tree.insert(node);
    
        node = new No3_Node(30);
        tree.insert(node);
    
        node = new No3_Node(20);
        tree.insert(node);
    
        node = new No3_Node(40);
        tree.insert(node);
    
        node = new No3_Node(70);
        tree.insert(node);
        System.out.print("Traversal dengan inorder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan postrder :");
        tree.postOrder();
        System.out.println();
        
        System.out.println("");
        System.out.println("R. Rekyan Maulana Setyawan");
    }        
}
