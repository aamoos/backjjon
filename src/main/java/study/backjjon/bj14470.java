package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj14470
 * author         : 김재성
 * date           : 2022-08-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-09        김재성       최초 생성
 */
public class bj14470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //원래의 고기의온도
        int A = Integer.parseInt(br.readLine());

        //목표 온도
        int B = Integer.parseInt(br.readLine());

        //얼어있는 고기를 1도 데이두는데 걸리는시간 (0도미만)
        int C = Integer.parseInt(br.readLine());

        //고기를 해동하는게 걸리는시간 (정확히 0도)
        int D = Integer.parseInt(br.readLine());

        //얼어있지 않는 고기를 1도 데우는데 걸리는시간 (0도보다 초과)
        int E = Integer.parseInt(br.readLine());

        if (A < 0){
            System.out.println(Math.abs(A)*C + D + B*E);
        } else{
            System.out.println((B-A)*E);
        }
    }
}
