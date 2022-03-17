package study.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int board[][] = new int[n+1][n+1];

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();

        int moves[] = new int[m];

        for (int i=0;i<m;i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(solution(n, board, m, moves));
    }

    public int solution(int n, int board[][], int m, int pick[]) {
        int ans = 0;
        Stack<Integer> s = new Stack<>();

        for (int i=0;i<m;i++){
            for(int j=1;j<=n;j++){

                //넣을 대상 숫자
                int t = board[j][pick[i]];

                if (t != -1 && t !=0){
                    if (!s.isEmpty()){
                        //스택에 넣기
                        if (s.peek() != t){
                            s.push(t);
                        }
                        else{
                            s.pop();
                            ans++;
                        }
                    }
                    else
                    {
                        s.push(t);
                    }

                    //체크 완료 표시
                    board[j][pick[i]] = -1;

                    break;
                }
            }
        }

        return ans*2;
    }
}
