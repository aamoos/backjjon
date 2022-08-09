package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj2422
 * author         : 김재성
 * date           : 2022-08-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-09        김재성       최초 생성
 */
public class bj2422 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        //스페이스바 4 별 1
        //스페이스바 3 별 3
        String space = " ";
        String star = "*";
        int starCount = 1;
        for(int i=1; i<=N; i++){
            int spaceCount = N-i;
            if(i>1){
                starCount+=2;
            }
            System.out.println(space.repeat(spaceCount)+star.repeat(starCount));
        }
    }
}
