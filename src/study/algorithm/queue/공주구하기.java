package study.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 공주구하기 {

    public void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(solution(n,m));
    }

    public int solution(int n,int m){
        int ans = 0;

        Queue<Integer> q = new LinkedList<>();

        for (int i =0; i<n; i ++){
            q.offer(i+1);
        }

        while(!q.isEmpty()){
            for (int i=1;i<m;i++){
                q.offer(q.poll());
            }

            q.poll();

            if (q.size() == 1) {
                ans = q.poll();
                break;
            }
        }

        return ans;
    }
}
