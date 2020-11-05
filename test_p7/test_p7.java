import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p7 {
    public static void main(String[] args)throws IOException
    {
        System.out.print("Please enter a integer:"); //print
        BufferedReader br1 = 
            new BufferedReader(new InputStreamReader(System.in)); //transform bits data from keyboard into bufferedreader,and into br1
        
        int num=Integer.parseInt(br1.readLine()); //read br1 by line, and change str to int

        //with correct if syntax
        if(num==1)
        {
            System.out.println("Your enter is 1"); //print
            System.out.println("Your choose is 1"); //print
        }
        System.out.println("over"); //print
    }
}
