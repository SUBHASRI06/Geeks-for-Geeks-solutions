import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        char arr[] = s.toCharArray();
        for(int i=0;i<N-1;i++){
            if(arr[i]=='H' && arr[i+1]=='H'){
                System.out.println("NO");
                return;
            }
        }
        for(int i=0;i<N;i++){
            if(arr[i] == '.'){
                arr[i] = 'B';
            }
        }
        System.out.println("YES");
        System.out.println(new String(arr));
    }
}
