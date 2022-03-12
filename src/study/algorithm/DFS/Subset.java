package study.algorithm.DFS;

public class Subset {

    int[] ch;
    int n;

    //부분집합 구하기(DFS)
    public void run(int n)
    {
        ch = new int[n+1];
        this.n = n;

        DFS(1);
    }

    private void DFS(int start)
    {
        //3
        //1, 2, 3
        if (n + 1 == start) {
            String tmp = "";
            for (int i=1;i<=n;i++){
                if (ch[i] == 1) tmp += i + " ";
            }

            if (tmp.length() > 0) System.out.println(tmp);
        }

        else {
            ch[start] = 1;
            DFS(start+1);
            ch[start] = 0;
            DFS(start+1);
        }
    }
}
