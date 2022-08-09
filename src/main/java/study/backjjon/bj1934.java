package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : study.backjjon
 * fileName       : bj1934
 * author         : 김재성
 * date           : 2022-08-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-09        김재성       최초 생성
 */
public class bj1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int d = gcd(a, b);

            sb.append(a * b / d).append('\n');
        }
        System.out.println(sb);
    }

    public static int gcd(int a, int b){
        while (b != 0){
            int r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}
