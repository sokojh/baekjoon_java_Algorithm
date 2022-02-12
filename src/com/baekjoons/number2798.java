package com.baekjoons;
import java.util.*;
public class number2798 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cardUnitN = s.nextInt();
        int MaxM = s.nextInt();
        int[] arr = new int[cardUnitN];
        for(int i=0; i<cardUnitN;i++){
            arr[i] = s.nextInt();
        }
        int result = search(arr,cardUnitN,MaxM);
        System.out.println(result);

    }
    // 탐색 함수
    static int search(int[] arr, int cardUnitN, int MaxM){
        int result =0;
        //3개를 고르기 때문에 첫번째 카드는 cardUnitN-2까지만 순회
        for (int i =0; i<cardUnitN-2; i++){
            //두 번째 카드는 첫 번째 카드 다음부터 cardUnitN-1까지만 순회
            for(int j=i+1;j<cardUnitN-1;j++){
                //세 번째 카드는 두번째 카드 다음부터 cardUnitN까지 순회
                for(int k= j+1; k<cardUnitN;k++){
                    //3개 카드의 합 변수 temp
                    int temp = arr[i]+arr[j]+arr[k];
                    //MaxM과 세 카드의 합이 같다면 temp return 및 종료
                    if(MaxM == temp){
                        return temp;
                    }

                    //세 카드의 합이 이전 합보다 크면서 MaxM보다 작을 경우 result 갱신
                    if(result<temp&&temp<MaxM){
                        result=temp;

                    }

                }

            }

        }
        //모든 순회를 마치면 result리턴
        return result;
    }
}
