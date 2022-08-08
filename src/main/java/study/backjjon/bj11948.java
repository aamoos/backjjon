package study.backjjon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName    : study.backjjon
 * fileName       : bj11948
 * author         : 김재성
 * date           : 2022-08-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-08-08        김재성       최초 생성
 */
public class bj11948 {
    public static void main(String[] args) throws IOException {

        Integer[] arr1 = new Integer[4];
        Integer[] arr2 = new Integer[2];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j=0;
        for(int i=0; i<6; i++){
            if(i<4){
                arr1[i] = Integer.parseInt(br.readLine());
            } else{
                arr2[j] = Integer.parseInt(br.readLine());
                j++;
            }
        }

        Arrays.sort(arr1, Comparator.reverseOrder());
        Arrays.sort(arr2, Comparator.reverseOrder());

        System.out.println(arr1[0]+arr1[1]+arr1[2]+arr2[0]);
    }
}
