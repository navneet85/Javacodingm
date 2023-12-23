package Binarysearchtree;

import java.util.ArrayList;

public class SortedArrayToBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    public static Node createBst( int arr[],int start,int end){

        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);

        root.left=createBst(arr, start, mid-1);
        root.right=createBst(arr, mid+1, end);

        return root;
    }
    //
    public static Node createBstfromInorder( ArrayList<Integer> arr,int start,int end){

        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr.get(mid));

        root.left=createBstfromInorder(arr, start, mid-1);
        root.right=createBstfromInorder(arr, mid+1, end);

        return root;
    }
    //
    public static void preOrder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);

    }

    public static Node convertBstToBalancedBst(Node root){
        //we need to get sorted inorder sequence
        ArrayList<Integer> arr=new ArrayList<>();
        getInorder(root, arr);
        //sorted inorder to balanced bst
        return createBstfromInorder(arr, 0, arr.size()-1);

    }
    public static void main(String[] args) {

        int arr[]={3,5,6,8,10,11,12};
        Node root=createBst(arr, 0, arr.length-1);
        preOrder(root);

        //for convertBstToBalancedBst
        Node newroot=new Node(8);
        newroot.left=new Node(6);
        newroot.left.left=new Node(5);
        newroot.left.left.left=new Node(3);
        newroot.right=new Node(10);
        newroot.right.right=new Node(11);
        newroot.right.right.right=new Node(12);
        System.out.println();
        preOrder(convertBstToBalancedBst(newroot));
        
        
    }
}
