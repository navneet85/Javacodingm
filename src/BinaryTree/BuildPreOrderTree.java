package BinaryTree;

import java.util.*;

public class BuildPreOrderTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;

        static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
              return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");

        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return ;
        }
        postOrder(root.left);
        
        postOrder(root.right);
        System.out.print(root.data);
    }

    public static void levelOrder(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                } else{
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+" ");
                if(currNode.left!= null){
                    q.add(currNode.left);
                }
                if(currNode.right!= null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);

        return Math.max(lh, rh)+1;
    }
    //using level order traversal
    // public static void kthLevel(int n,Node root){
    //     if(root==null){
    //         return ;
    //     }
    //     Queue<Node> q= new LinkedList<>();
    //     q.add(root);
    //     q.add(null);
    //     int count=1;
    //     while(!q.isEmpty()){
    //         Node currNode=q.remove();
    //         if(currNode==null){
    //             System.out.println();
    //             if(q.isEmpty()){
    //                 break;
    //             } else{
    //                 count=count+1;
    //                 q.add(null);
    //             }
    //         } else {
    //             if(count==n)
    //             System.out.print(currNode.data+" ");
    //             if(currNode.left!= null){
    //                 q.add(currNode.left);
    //             }
    //             if(currNode.right!= null){
    //                 q.add(currNode.right);
    //             }
    //         }
    //     }
    //     System.out.println(count);
    // }

    

    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);

        return lc+rc+1;
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int ls=sum(root.left);
        int rs=sum(root.right);

        return ls+rs+root.data;
    }
    public static int diam(Node root){
        if(root==null){
            return 0;
        }
        int ld= diam(root.left);
        int rd=diam(root.right);
        int lh=height(root.left);
        int rh=height(root.right);

        return Math.max(Math.max(ld,rd),lh+rh+1);
    }
    public static void kLevel(Node root,int level,int k){
        if(root == null){
            return;
        }

        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        kLevel(root.left,level+1,k);
        kLevel(root.right,level+1,k);

    }

    public static boolean isSubtree(Node root,Node subroot){
        if(root == null){
            return false;
        }

        if(root.data==subroot.data){
           if(isIdentical(root,subroot)){
             return true;
           }
        } 

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

   private static boolean isIdentical(Node root, Node subroot) {
        if(root==null && subroot==null){
            return true;
        } else if(root == null || subroot==null || root.data!=subroot.data){
            return false;
        }

        if(!isIdentical(root.left, subroot.left)|| !isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;
    }

    static class Info{
        Node node;
        int hd;

        Info(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }

    public static void TopView(Node node){
       //level order traversal we need to do first
       Queue<Info> q= new LinkedList<>();
       HashMap<Integer,Node> hs=new HashMap<>();
       int min=0,max=0;
       q.add(new Info(node, 0));
       q.add(null);
       while(!q.isEmpty()){
          Info curr= q.remove();
          if(curr==null){
            if(q.isEmpty()){
                break;
            } else{
               q.add(null);
            }
          } else{
            if(!hs.containsKey(curr.hd)){
                hs.put(curr.hd,curr.node);
              }
    
              if(curr.node.left!=null){
                q.add(new Info(curr.node.left,curr.hd-1));
                min=Math.min(min,curr.hd-1);
              }
              if(curr.node.right!=null){
                q.add(new Info(curr.node.right,curr.hd+1));
                max=Math.max(max,curr.hd+1);
              }
          }
          //for first occurence of hd
          

       }
       for(int i=min;i<=max;i++){
            System.out.print(hs.get(i).data+" ");
       }
       System.out.println();
    }

    //lowest common ancestor code
    public static Node lca(Node root,int n1,int n2){
        //we will take arraylist for two path
        ArrayList<Node> path1=new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        //we will call getPath function for both bath
        getPath(root,n1,path1);
        getPath(root,n2,path2);

        //last common ancestor
        
        int i=0;
        for(;i<path1.size()&& i<path2.size();i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        //lat equal node=i-1;
        //System.out.println(i-1);
        Node lca=path1.get(i-1);
        return lca;

    }
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        //base case
       if(root==null){
        return false;
       }
       path.add(root);
       if(root.data==n){
        return true;
       }

       boolean foundLeft=getPath(root.left, n, path);
       boolean foundRight=getPath(root.right, n, path);

       if(foundLeft || foundRight){
        return true;
       }
       //we will remove root from path because n is not present in root and neither in left and right
       path.remove(path.size()-1);


       return false;
    }

    public static Node lca2(Node root,int n1,int n2){

        if(root.data==n1 || root.data==n2 || root== null){
            return root;
        }

        Node leftLca=lca(root.left, n1, n2);
        Node rightLca=lca(root.right,n1,n2);

        if(rightLca== null){
            return leftLca;
        }
        if(leftLca== null){
            return rightLca;
        }

        return root;
    }

    public static int minDistance(Node root,int n1,int n2){
        Node lca=lca2(root, n1, n2);
        int dist1=lcaDist(lca,n1);
        int dist2=lcaDist(lca,n2);

        return dist1+dist2;
    }

    public static int lcaDist(Node root, int n) {

        if(root== null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist=lcaDist(root.left, n);
        int rightDist=lcaDist(root.right, n);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        } else if(leftDist==-1){
            return rightDist+1;
        } else{
            return leftDist+1;

        }


    }

    public static int KthAncestor(Node head,int n,int k){
        if(head== null){
            return -1;
        }

        if(head.data==n){
           return 0;
        }
        int leftDist=KthAncestor(head.left, n, k);
        int rightDist=KthAncestor(head.right, n, k);

        if(leftDist==-1 && rightDist==-1){
            return -1;
        } 

        int max=Math.max(leftDist,rightDist);
        if(max+1==k){
            System.out.println(head.data);
        }

        return max+1;
    }

    public static int transformToSum(Node root){
        if(root==null){
            return 0;
        }
        int leftChild=transformToSum(root.left);
        int rightChild=transformToSum(root.right);

        int data=root.data;
        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;
        
        root.data=newLeft+leftChild+newRight+rightChild;
        return data;
    }

public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node node=BinaryTree.buildTree(nodes);
        // preOrder(node);
        // System.out.println();
        // inOrder(node);
        // System.out.println();
        // postOrder(node);
        // System.out.println();
        // levelOrder(node);
        // System.out.println(height(node));
        // System.out.println(count(node));
        // System.out.println(sum(node));
        // System.out.println(diam(node));
        Node root=new Node(2);
        root.left=new Node(4);
        root.right=new Node(6);
        root.left.left=new Node(7);
        root.left.right=new Node(8);
        root.right.left=new Node(9);
        root.right.right=new Node(10);
        //System.out.println(isSubtree(node, root));
        TopView(root);
        System.out.println();
        //kthLevel(3,root);
        // kLevel(root, 1, 3);
        // System.out.println();
        // System.out.println(lca(root, 7, 8).data);
        System.out.println();
        //System.out.println(minDistance(root, 7, 8));
       System.out.println(KthAncestor(root, 8, 2));
       transformToSum(root);
       preOrder(root);
    }
}
