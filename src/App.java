import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
       try {
         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
   String aline;

   aline = in.readLine();
   System.out.println("Hello, World!" + aline);
       } catch (Exception e) {
        // TODO: handle exception
       }
        
    }
}
