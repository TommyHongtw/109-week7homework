import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p21 {
    public static void main(String[] args)throws IOException
    {
        System.out.println("Which route you want to go?");
        System.out.println("Please enter integer");
        BufferedReader br1 =
            new BufferedReader(new InputStreamReader(System.in));
        
        String str = br1.readLine();
        int res = Integer.parseInt(str);
        char ans=(res==1)?'A':'B'; //if res=1 then ans=A,else ans=B
       
        System.out.println("You choose "+ans+" path");
    }
    
}
