package study.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    public String solution(String str){
        Stack<Character> s = new Stack<>();
        String ans = "";

//        for(char x : str.toCharArray()){
//            if (x == '('){
//                s.push('(');
//            }
//
//            else if (x == ')'){
//                s.pop();
//            }
//
//            else if (s.isEmpty()){
//                ans += x;
//            }
//        }

        for (char x: str.toCharArray()){
            if (x == ')'){
                while(s.pop() != '(');
            }
            else s.push(x);
        }

        for(int i =0;i<s.size();i++) ans += s.get(i);

        return ans;
    }
}
