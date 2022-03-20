package study.algorithm.stack;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {

    public void run(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    public int solution(String str){
        int ans = 0;

        Stack<Character> s = new Stack<>();

        for (int i=0;i<str.length();i++){
            if (str.charAt(i) == '('){
                s.push('(');
            }
            else{
                s.pop();

                if (str.charAt(i-1) == '('){
                    //레이저 발견
                    ans += s.size();
                }
                else{
                    ans += 1;
                }
            }
        }

        return ans;
    }
}
