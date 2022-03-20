package study.algorithm.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {
    public void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Person p[] = new Person[n];

        for(int i=0;i<n;i++){
            p[i] = new Person(i, sc.nextInt());
        }

        System.out.println(solution(n, m, p));
    }

    public int solution(int n, int m, Person p[]) {

        Queue<Person> q = new LinkedList<>();

        for(Person p_:p){
            q.offer(p_);
        }

        while(!q.isEmpty()){
            Person person = q.poll();

            for(Person p_:q){
                if (p_.priority > person.priority) q.offer(person);
            }
        }

        return ans;
    }

    class Person{
        int id;
        int priority;
        Person(int id, int priority){
            this.id = id;
            this.priority = priority;
        }
    }
}
