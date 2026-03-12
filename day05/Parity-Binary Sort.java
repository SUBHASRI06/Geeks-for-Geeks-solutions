import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int A[] = new int[N];
            int even[] = new int[N];
            int odd[] = new int[N];
            int e = 0;
            int o = 0;
            for(int i=0;i<N;i++){
                A[i] = sc.nextInt();
            }
            for(int i=0;i<N;i++){
                String s = Integer.toBinaryString(A[i]);
                int count = 0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)=='1'){
                        count++;
                    }
                }
                if(count % 2 == 0){
                    even[e++] = A[i];
                }else{
                    odd[o++] = A[i];
                }
            }

            Arrays.sort(even,0,e);
            Arrays.sort(odd,0,o);
            int index = 0;
            for(int i=0;i<e;i++){
                A[index++] = even[i];
            }

            for(int i=0;i<o;i++){
                A[index++] = odd[i];
            }

         for(int i=0;i<N;i++){
                System.out.print(A[i]+" ");
            }

            System.out.println();
        }
    }
}