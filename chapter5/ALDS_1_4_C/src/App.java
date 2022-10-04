import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class App {
    Map<String, String> T = new HashMap<>();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Directory(n);
        scanner.close();
    }
    public static void Directory(int n){
        Scanner scanner = new Scanner(System.in);
        String querys[] = new String[n];
        for(int i=0; i<n; i++){
            String input = scanner.nextLine();
            String query[] = input.split(" "); 
            if(query[0] == "insert"){

            } else if (query[0] == "find"){
                
                System.out.println();
            }
        }
        System.out.println(querys);
        scanner.close();
    }
    public static void insert(String value){

    }
    public static boolean search(String value){

    }
    
}
