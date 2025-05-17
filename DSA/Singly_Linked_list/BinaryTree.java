
package solve_problems.DSA.Singly_Linked_list;
class Node{
    int data;
    Node left;
    Node right;
    
    public Node(int data){
        this.data=data;
    }
}
class BinaryTree {
    
    Node root;
    
    public void insert(int data){
        root =insertRecurusion(root, data);
    }
    public Node insertRecurusion(Node root,int data){
        if(root==null){
            root = new Node(data);
        }else if(data < root.data){
            root.left=insertRecurusion(root.left,data);
        }else if(data > root.data){
            root.right=insertRecurusion(root.right,data);
        }
        return root;
    }//Inorder
    public void inorder(){
        inorderRecurusion(root);
    }
    public void inorderRecurusion(Node root){
        if(root!=null){
          inorderRecurusion(root.left);  
          System.out.print(root.data + " ");
          inorderRecurusion(root.right);
        }
        
    }
    //preorder
    
    public void preorder(){
        preorderRecurusion(root);
    }
    public void preorderRecurusion(Node root){
        if(root!=null){
              
          System.out.print(root.data + " ");
          preorderRecurusion(root.left);
          preorderRecurusion(root.right);
        }
        
    }
}
