import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p32 {
    public static void main(String[] args)throws IOException
    {
        System.out.println("You want to end in which round?(1~10)");
        BufferedReader br1=
            new BufferedReader(new InputStreamReader(System.in));
        String str = br1.readLine();
        int res = Integer.parseInt(str);

        //break will shot down the loop
        for(int i=1;i<10;i++)
        {
          if(i==res)
          {
            System.out.println("loop is ended");
              break;
          }
          System.out.println(i+"th");

        }
    }
}
