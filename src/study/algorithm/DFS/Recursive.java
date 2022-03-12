package study.algorithm.DFS;

public class Recursive {

    int [] fibo;

    //피보나치(재귀)
    public void run(int n){

        //1.
//        for (int i=1;i<=n;i++) System.out.print(DFS_1(i) + " ");

        //2.
//        fibo = new int[n+1];
//        DFS_2(n);
//        for (int i=1;i<=n;i++) System.out.print(fibo[i] + " ");

        //3.
        fibo = new int[n+1];
        DFS_3(n);
        for (int i=1;i<=n;i++) System.out.print(fibo[i] + " ");
    }

    //성능: 하
    public int DFS_1(int n){
        if (n == 1) return 1;
        else if (n == 2) return 1;
        else {
            return DFS_1(n-2) + DFS_1(n-1);
        }
    }

    //성능: 중
    public int DFS_2(int n){
        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else {
            return fibo[n] = DFS_2(n-2) + DFS_2(n-1);
        }
    }

    //성능: 상
    public int DFS_3(int n){
        if (fibo[n] > 0) return fibo[n];
        else if(n == 1) return fibo[n] = 1;
        else if(n == 2) return fibo[n] = 1;
        else {
            return fibo[n] = DFS_3(n-2) + DFS_3(n-1);
        }
    }

}
