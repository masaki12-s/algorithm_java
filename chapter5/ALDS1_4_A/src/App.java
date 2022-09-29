public class App {
    public static void main(String[] args) throws Exception {
        int n = 5;
        int[] S = {1,2,3,4,5};
        int q = 3;
        int[] T = {3,4,1};
        int ans = Linear_Search(n, S, q, T);
        System.out.println(ans);
    }

    public static int Linear_Search(int n, int[] S, int q, int[] T){
        int C = 0;
        for(int i=0; i<q; i++){
            for(int j=0; j<n; j++){
                if(T[i] == S[j]){
                    C++;
                }
            }
        }
        return C;
    }
}
