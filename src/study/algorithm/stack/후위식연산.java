package study.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    public int solution(String str){
        Stack<Integer> s = new Stack<>();

        int lt,rt;
        int tmp = 0;

        for (char c : str.toCharArray()){
            if (Character.isDigit(c)){
                s.push(Character.getNumericValue(c));
            }
            else{
                rt = s.pop();
                lt = s.pop();

                if (c == '*') tmp = lt * rt;
                else if (c == '+') tmp = lt + rt;
                else if (c == '-') tmp = lt - rt;
                else if (c == '/') tmp = lt / rt;

                s.push(tmp);
            }
        }

        return s.get(0);
    }

}
