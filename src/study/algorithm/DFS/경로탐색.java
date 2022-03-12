package study.algorithm.DFS;

import java.util.Scanner;

public class 경로탐색 {

    int answer;
    int a,b;
    int ch[];
    int graph[][];

    //방향 그래프
    //a: 정점 개수, b: 간선 개수
    public void run(){
        Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         b = sc.nextInt();

         graph = new int[a+1][a+1];
         ch = new int[a+1];

        for(int i=0;i<b;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            graph[n][m] = 1;
        }

        ch[1] = 1;
        DFS(1);

        System.out.println(answer);
    }

    void DFS(int v){
        if(v == a){
            answer++;
        }
        else
        {
            for (int i=1;i<=a;i++){
                if (ch[i] == 0 && graph[v][i] == 1){
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }
}
