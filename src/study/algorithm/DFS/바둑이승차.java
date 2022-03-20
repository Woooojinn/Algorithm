package study.algorithm.DFS;

import java.util.Scanner;

public class 바둑이승차 {

    int kg;
    int num;
    int weight[];

    int ans = 0;

    public void run(){
        Scanner sc = new Scanner(System.in);
         kg = sc.nextInt();
         num = sc.nextInt();
         weight = new int[num];

        for (int i=0;i<num;i++){
            weight[i] = sc.nextInt();
        }

        DFS(0,0);

        System.out.println(ans);
    }

    public void DFS(int level, int sum){
        if (sum > kg) return;
        if (level == num){
            ans = Math.max(sum, ans);
            return;
        }
        else {
            DFS(level+1, sum+weight[level]);
            DFS(level+1, sum);
        }
    }
}
