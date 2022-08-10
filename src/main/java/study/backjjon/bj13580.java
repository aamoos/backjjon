package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName    : study.backjjon
 * fileName       : bj13580
 * author         : 김재성
 * date           : 2022-08-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-10        김재성       최초 생성
 */
public class bj13580 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arr[] = br.readLine().split(" ");
        Arrays.sort(arr, Comparator.reverseOrder());
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        if(a == b || b == c || a+b == c){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}