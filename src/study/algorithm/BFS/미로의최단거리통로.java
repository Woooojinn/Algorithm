package study.algorithm.BFS;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로의최단거리통로 {

    int board[][];
    int dis[][];
    int dx[] = {-1, 0, 1, 0};
    int dy[] = {0, 1, 0, -1};

    public void run() {
        Scanner sc = new Scanner(System.in);

        board = new int[8][8]; //방문 체크도 같이
        dis = new int[8][8];

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        BFS(1, 1);

        if (board[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }

    public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.offer(new Point(x, y));
        board[x][y] = 1;

        while (!Q.isEmpty()) {
            Point cur = Q.poll();

            for (int j = 0; j < 4; j++) {
                int nx = cur.x + dx[j];
                int ny = cur.y + dy[j];

                //방문 가능 좌표
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    Q.offer(new Point(nx, ny));
                    board[nx][ny] = 1;
                    dis[nx][ny] = dis[cur.x][cur.y] + 1;
                }
            }
        }
    }

    class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
