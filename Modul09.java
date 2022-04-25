import java.util.Scanner; 
 
public class Modul09 { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        BinaryTree2 bt = new BinaryTree2(); 
        System.out.println("Test Input"); 
        
        System.out.println("Enter integer element to insert"); 
        bt.insert(23); 
        bt.insert(10); 
        bt.insert(5); 
        bt.insert(8); 
        bt.insert(11); 
        bt.insert(4); 
        bt.insert(7); 

        System.out.print("\nPost order : "); 
        bt.postorder(); 
        System.out.print("\nPre order : "); 
        bt.preorder(); 
        System.out.print("\nIn order : "); 
        bt.inorder();       

    } 
} 
