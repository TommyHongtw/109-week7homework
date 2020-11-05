import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p12 {
    public static void main(String[] args)throws IOException 
    {
        System.out.println("Please enter a integet:");
        BufferedReader br1 =
            new BufferedReader(new InputStreamReader(System.in));
        
            int num=Integer.parseInt(br1.readLine());

            //there have three kind of conditions, consider input was 1 or 2 or others
            if(num==1)
            {
                System.out.println("your input is 1"); //print
            }
            else if(num==2)
            {
                System.out.println("your input is 2"); //print
            }
            else 
            {
                System.out.println("Please endter 1 or 2"); //print
            }
        

    }
    
}
