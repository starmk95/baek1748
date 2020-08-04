import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 브루트 포스
        // n의 최대값은 1억인데 그러면 수가 너무 많다.
        // 모든 경우를 고려하지 않고, 1의자리는 자리수를 1증가, 10의 자리는 2증가, 100의 자리는 3증가, ...
        // 하는 특성을 이용한다.
        int digits = (int)(Math.log10(num)+1); // 몇자리수인지 구하기
        int len = 0;
        if (digits < 2) { // 한자리수가 들어왔을 때
            len+=num;
        } else { // 두자리수 이상일 때
            len += (num - Math.pow(10, digits-1) + 1)*digits;
            digits-=1;
            for (int i=0;i<digits;i++) {
                len+=9*Math.pow(10, i)*(i+1);
            }
        }
        System.out.println(len);
    }
}
