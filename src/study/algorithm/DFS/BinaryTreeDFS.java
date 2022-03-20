package study.algorithm.DFS;

public class BinaryTreeDFS {

    private class Node{
        int data;
        Node lt, rt;
        Node(int value){
            data = value;
            lt = rt = null;
        }
    }

    //이진탐색트리(DFS)
    private void DFS(Node root){
        //전위순회
        if (root == null) return;
        else {
            System.out.print(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }

        //중위순회
//        if (root == null) return;

//        else {
//            DFS(root.lt);
//            System.out.print(root.data + " ");
//            DFS(root.rt);
//        }

        //후위순회
//        if (root == null) return;
//        else {
//            DFS(root.lt);
//            DFS(root.rt);
//            System.out.print(root.data + " ");
//        }
    }

    public void run() {
        Node root;

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
    }
}
