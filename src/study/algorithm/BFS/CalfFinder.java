package study.algorithm.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class CalfFinder {

    //a:5 , b:14
    private int BFS(int a, int b) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(a);
        int L = 0;
        int ch[] = new int[100001];
        int dis[] = {1, -1, 5};

        while (!q.isEmpty()) {
            int len = q.size();

            for (int i = 0; i < len; i++) {
                int cur = q.poll(); //5

                for (int j = 0; j < dis.length; j++) {
                    int next = cur + dis[j];

                    if (next == b) {
                        return L + 1;
                    }

                    ch[next] = 1;
                    q.offer(next);
                }
            }

            L++;
        }

        return 0;
    }

    public void run(int a, int b)
    {
        System.out.println(BFS(a,b));
    }
}


