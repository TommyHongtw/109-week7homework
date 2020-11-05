import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p8 {
    public static void main(String[] args)throws IOException
    {
        System.out.print("Please enter a integer:");
        BufferedReader br1 = 
            new BufferedReader(new InputStreamReader(System.in));

        int num=Integer.parseInt(br1.readLine());

        //there use if without {},so just has one line contain in if
        if(num==1)
            System.out.println("Your enter is 1"); //print
            System.out.println("Your choose is 1"); //print
        System.out.println("over"); //print
    }
}
