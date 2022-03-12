package study.algorithm.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class 말단노드까지최단거리 {

    class Node{
        int data;
        Node lt,rt;

        Node(int value){
            data = value;
            lt=rt=null;
        }
    }

    public int BFS(Node root){
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;

        while(!Q.isEmpty()){
            int len = Q.size();

            for (int i=0;i<len;i++){
                Node cur = Q.poll();

                //말단 노드 확인
                if (cur.lt == null && cur.rt == null){
                    return L;
                }

                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }

        return 0;
    }

    public void run(){
        Node root;

        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        System.out.println(BFS(root));
    }
}
