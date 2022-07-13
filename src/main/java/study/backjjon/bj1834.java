package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    N으로 나누었을때 나머지와 몫이 같은 모든 자연수의 합을 구하는 프로그램
 */
public class bj1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = Long.parseLong(br.readLine());
        long sum = 0;
        for(long i=1; i<num; i++){
            sum+= (num+1)*i;
        }
        System.out.println(sum);
    }
}
