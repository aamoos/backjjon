package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : study.backjjon
 * fileName       : bj21591
 * author         : 김재성
 * date           : 2022-08-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-12        김재성       최초 생성
 */
public class bj21591 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w1 = Integer.parseInt(st.nextToken());
        int h1 = Integer.parseInt(st.nextToken());
        int w2 = Integer.parseInt(st.nextToken());
        int h2 = Integer.parseInt(st.nextToken());

        if(w1-w2 >=2 && h1-h2 >=2){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
