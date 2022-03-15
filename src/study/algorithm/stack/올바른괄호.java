package study.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    public String solution(String str){
        Stack<Character> s = new Stack();

        for (char x: str.toCharArray()){
            if (x== '(') s.push(x);
            else {
                if (s.isEmpty()) return "NO";
                s.pop();
            }
        }

        if (!s.isEmpty()) return "NO";
        return "YES";
    }
}
