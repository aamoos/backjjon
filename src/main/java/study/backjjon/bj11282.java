package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj11282
 * author         : 김재성
 * date           : 2022-08-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-12        김재성       최초 생성
 */
public class bj11282 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        //입력된 값과 아스키코드 값을 맞추기 위해 44031을 더한다.
        N += 44031;

        //한글로 출력하기 위해 char형으로 형 변환
        char C = (char) N;
        System.out.println(C);
    }
}
