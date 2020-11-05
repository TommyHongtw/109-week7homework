import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p14 {
    public static void main(String[] args)throws IOException 
    {
        System.out.println("Please enter a integer:");

        BufferedReader br1 = 
            new BufferedReader(new InputStreamReader(System.in));
        int num= Integer.parseInt(br1.readLine());

        //switch;if num=1 into case 1,else if num=2 into case 2,otherwise into default
        switch(num)
        {
            case 1:
            {
                System.out.println("Your input is 1");
                break;
            }
            case 2:
            {
                System.out.println("Your input is 2");
                break;
            }
            default:
            {
                System.out.println("Please input 1 or 2");
                break;
            } 
        }
    }
}
