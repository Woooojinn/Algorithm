package study.algorithm.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프최단거리 {

    int a,b;
    ArrayList<ArrayList<Integer>> graph;
    int ch[];
    int dis[]; // 최단 거리 기록 배열 사용
    int L; // 최단 거리 BFS 레벨 활용

    public void run(){
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        ch = new int[a+1];
        dis = new int[a+1];

        graph = new ArrayList<>();

        for (int i=0;i<=a;i++){
            graph.add(new ArrayList<>());
        }

        for (int i=0;i<b;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            //인접리스트 형태로 저장
            graph.get(n).add(m);
        }

        ch[1] = 1;
        dis[1] = 0;
        BFS(1);

        for (int i =2;i<dis.length;i++) System.out.println(i + ":" + dis[i]);
    }

    void BFS(int v){
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v); //1 저장

        while(!Q.isEmpty()){
            int cv = Q.poll(); //1

            for (int nv: graph.get(cv)){
                //1과 연결된 정점 번호 가져오기
                //ex. 2,4,5..

                if (ch[nv] == 0){
                    ch[nv] = 1;
                    dis[nv] = dis[cv] + 1;
                    Q.offer(nv);
                }
            }
        }
    }

}
