import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p15 {
    public static void main(String[] args)throws IOException
    {
        System.out.println("Please enter a integer:");

        BufferedReader br1 = 
            new BufferedReader(new InputStreamReader(System.in));
        int num= Integer.parseInt(br1.readLine());

        //wrong switch syntax, without break; switch will continually execute every case
        switch(num)
        {
            case 1:
            {
                System.out.println("Your input is 1");
            }
            case 2:
            {
                System.out.println("Your input is 2");
            }
            default:
            {
                System.out.println("Please input 1 or 2");
            } 
        }
    }
    
}
