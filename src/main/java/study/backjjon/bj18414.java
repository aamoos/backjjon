package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : study.backjjon
 * fileName       : bj18414
 * author         : 김재성
 * date           : 2022-08-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-12        김재성       최초 생성
 */
public class bj18414 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int min = 0;
        int target = 0;
        for(int i=L; i<=R; i++){
            int result = Math.abs(X-i);
            if(i == L){
                min = result;
                target = i;
            }else{
                if(min > result){
                    min = result;
                    target = i;
                }
            }
        }
        System.out.println(target);
    }
}

