import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class test_p47 {
    public static void main(String[] args)throws IOException
    {
        Integer test[]=new Integer[5];
        System.out.println("Please enter 5 people's score:"); //print
        BufferedReader br1 = 
                new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<test.length;i++)
        {
            String str =br1.readLine();
            test[i]=Integer.parseInt(str);
        }

        Arrays.sort(test,Collections.reverseOrder());

        for(int i=0;i<test.length;i++)
        {
            System.out.println("Number "+i+" is "+test[i]);
        }
        
        
    }
}
