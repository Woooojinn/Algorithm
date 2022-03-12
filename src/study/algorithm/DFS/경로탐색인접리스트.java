package study.algorithm.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색인접리스트 {

    int a,b;
    int answer;
    ArrayList<ArrayList<Integer>> graph;
    int ch[];

    public void run(){
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       b = sc.nextInt();

        graph = new ArrayList<>();
        ch = new int[a+1];

       //5, 9
        for (int i=0;i<=a;i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0;i<b;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            graph.get(n).add(m);
        }

        ch[1] = 1;
        DFS(1);

        System.out.println(answer);
    }

    void DFS(int v){
        if (v == a){
            answer++;
        }

        else{
            for(int nv : graph.get(v)){
                //2,4,5
                if (ch[nv] == 0){
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }
}
