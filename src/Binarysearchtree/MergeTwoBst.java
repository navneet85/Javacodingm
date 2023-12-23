package Binarysearchtree;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoBst {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }  
    }
    public static void getInOrder(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        getInOrder(root.left, arr);
        arr.add(root.data);
        getInOrder(root.right, arr);
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        int i=0,j=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                arr.add(arr1.get(i));
                i++;
            } else{
                arr.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            arr.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            arr.add(arr2.get(j));
            j++;
        }
        return arr;
    }

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

    public static Node mergeTwoBst(Node root1,Node root2){
        //get inorder traversal for both
        ArrayList<Integer> arr1=new ArrayList<>();
        getInOrder(root1, arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        getInOrder(root2, arr2);
        return createBstfromInorder(merge(arr1, arr2), 0, merge(arr1, arr2).size()-1);
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
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        preOrder(mergeTwoBst(root1, root2));

    }
}
