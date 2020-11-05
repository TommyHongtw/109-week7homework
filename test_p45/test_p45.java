import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p45 {
    public static void main(String[] args)throws IOException
    {
        int test[]=new int[5];
        int a,b;
        System.out.println("Please enter 5 people's score:"); //print
        BufferedReader br1 = 
                new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<test.length;i++)
        {
            String str =br1.readLine();
            test[i]=Integer.parseInt(str);
        }

        for(int i=0;i<test.length-1;i++)
        {
            for(int j=i+1;j<test.length;j++)
            {
                if(test[i]<test[j])
                {
                    a=test[i];
                    b=test[j];
                    test[i]=b;
                    test[j]=a;
                }
            }
        }
        for(int i=0;i<test.length;i++)
        {
            System.out.println("Number "+i+" is "+test[i]);
        }
        
        
    }
}
