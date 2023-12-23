package Binarysearchtree;

import java.util.ArrayList;

public class BuildBst {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            //we can avoid this line as it is by default null
            // this.left=null;
            // this.right=null;
        }
    }

    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(val<root.data){
            //insert in left subtree
            root.left=insert(root.left, val);
        } else{
            //insert in right subtree
            root.right=insert(root.right,val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }

    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }

        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.println(root.data);
            printInRange(root.right, k1, k2);
        } else if(root.data>k1){
            printInRange(root.right, k1, k2);
        } else{
            printInRange(root.left, k1, k2);
        }
        
    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }

        if(key<root.data){
            return search(root.left, key);
        } else if(key>root.data){
            return search(root.right, key);
        } 

       return false;
        
    }

    public static Node delete(Node root,int val){
        
        if(val>root.data){
            root.right= delete(root.right, val);
        } else if(val<root.data){
            root.left= delete(root.left, val);
        } else{
            //case1 no child
            if(root.left==null && root.right==null){
                return null;
            } 
            //case 2 one child
            if(root.left==null){
                return root.right;
            } else if(root.right==null){
                return root.left;
            }
            //case 3rd both child
            //inordersuccessor means leftmost element in right tree
            Node inordersuccessor =findInorderSuccessor(root.right);
            root.data=inordersuccessor.data;
            root.right=delete(root.right,inordersuccessor.data);

        }
        return root;
    }
    public static Node findInorderSuccessor(Node root) {
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void printRootToLeaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
          
        path.add(root.data);
        if(root.left== null && root.right==null){
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path) {
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }

    public static boolean isValidBst(Node root,Node min,Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data<=min.data){
            return false;
        } else if(max!=null && root.data>=max.data){
            return false;
        }
        
        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    }

    public static Node mirror(Node root){
        if(root ==null){
            return null;
        }
        Node leftS=mirror(root.left);
        Node rightS=mirror(root.right);

        root.left=rightS;
        root.right=leftS;

        return root;
    }

    public static void preOrder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int arr[]={5,1,3,4,2,7};
        Node root=null;
        
        for(int i=0;i<arr.length;i++){
            root=insert(root, arr[i]);
        }
        inOrder(root);
        // System.out.println(search(root, 10));
        System.out.println();
        // root=delete(root, 1);
        // inOrder(root);
        //printInRange(root, 1, 3);
        //printRootToLeaf(root,new ArrayList<Integer>());
        //System.out.println(isValidBst(root, null, null));
        Node mirror=mirror(root);
        preOrder(mirror);
    }
}
