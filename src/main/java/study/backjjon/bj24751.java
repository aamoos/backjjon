package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : study.backjjon
 * fileName       : bj24751
 * author         : 김재성
 * date           : 2022-08-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-08        김재성       최초 생성
 */
public class bj24751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double optionOne = Double.parseDouble(br.readLine());
        System.out.println(String.format("%.10f", 100 / optionOne));
        System.out.println(String.format("%.10f", 100 / (100-optionOne)));
    }
}
