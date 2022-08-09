package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj2747
 * author         : 김재성
 * date           : 2022-08-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-09        김재성       최초 생성
 */
public class bj2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F1 = 0, F2=1, F3=1;

        for(int i=2; i<=N; i++){
            F3 = F1+F2;
            F1 = F2;
            F2 = F3;
        }
        System.out.println(F3);
    }
}
