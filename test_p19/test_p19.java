import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p19 {
    public static void main(String[] args)throws IOException
    {
        System.out.println("Are you male?");
        System.out.println("Please enter Y or N");
        BufferedReader br1 =
            new BufferedReader(new InputStreamReader(System.in));
        String str = br1.readLine();
        char letter = str.charAt(0); //just read first word of str

        //warining:can't use "" between char and string compare
        if(letter=='Y'||letter=='y')
        {
            System.out.println("You are man!");
        }
        else if(letter=='N'||letter=='n')
        {
            System.out.println("You ar women");
        }
        else
        {
            System.out.println("Please enter Y orN");
        }
    }
    
}
