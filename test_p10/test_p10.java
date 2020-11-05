import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p10 {
    public static void main(String[] args)throws IOException 
    {
        System.out.print("Please enter a integer:"); //print

        BufferedReader br1=
            new BufferedReader(new InputStreamReader(System.in));
        int num =Integer.parseInt(br1.readLine());

        //use if-else to seperate two kind of condition(1 or others)
        if (num==1)
        {
            System.out.println("Input is 1"); //print
        }
        else
        {
            System.out.println("Your choose isn't 1, is others"); //print
        }
    }
}
