package study.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        String need = sc.next();
        String plan = sc.next();

        System.out.println(solution(need,plan));
    }

    public String solution(String need, String plan){
        String ans = "YES";

        Queue<Character> q = new LinkedList<>();

        for (char c : need.toCharArray()){
            q.offer(c);
        }

        for(char c: plan.toCharArray()){
            if (q.contains(c)){
                //큐에 존재하면 꺼냄
                if (q.poll() != c){
                    ans = "NO";
                    return ans;
                }
            }
        }

        if (!q.isEmpty()) ans = "NO";

        return ans;
    }


}
