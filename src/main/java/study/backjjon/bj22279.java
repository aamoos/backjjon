package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : study.backjjon
 * fileName       : bj22279
 * author         : 김재성
 * date           : 2022-08-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-09        김재성       최초 생성
 */
public class bj22279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Double result = 0.0;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Double a = Double.parseDouble(st.nextToken());
            Double b = Double.parseDouble(st.nextToken());
            result+=(a*b);
        }
        System.out.println(result);
    }
}
